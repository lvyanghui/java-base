CREATE TABLE `fund_detail_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `fund_code` varchar(16) DEFAULT NULL COMMENT '基金代码',
  `fund_name` varchar(64) DEFAULT NULL COMMENT '基金简称',
  `fund_pinyin` varchar(32) DEFAULT NULL COMMENT '基金拼音',
  `fund_date` date DEFAULT NULL COMMENT '基金日期',
  `net_asset_value` decimal(16,4) DEFAULT NULL COMMENT '单位净值',
  `accumulated_net` decimal(16,4) DEFAULT NULL COMMENT '累计净值',
  `daily_grow_rate` decimal(16,4) DEFAULT NULL COMMENT '日增长率',
  `nearly_1_week_grow_rate` decimal(16,4) DEFAULT NULL COMMENT '近1周增长率',
  `nearly_1_month_grow_rate` decimal(16,4) DEFAULT NULL COMMENT '近1月增长率',
  `nearly_3_month_grow_rate` decimal(16,4) DEFAULT NULL COMMENT '近3月增长率',
  `nearly_6_month_grow_rate` decimal(16,4) DEFAULT NULL COMMENT '近6月增长率',
  `nearly_1_year_grow_rate` decimal(16,4) DEFAULT NULL COMMENT '近1年增长率',
  `nearly_2_year_grow_rate` decimal(16,4) DEFAULT NULL COMMENT '近2年增长率',
  `nearly_3_year_grow_rate` decimal(16,4) DEFAULT NULL COMMENT '近3年增长率',
  `nearly_5_year_grow_rate` decimal(16,4) DEFAULT NULL COMMENT '近5年增长率',
  `since_this_year_grow_rate` decimal(16,4) DEFAULT NULL COMMENT '今年以来增长率',
  `since_establish_grow_rate` decimal(16,4) DEFAULT NULL COMMENT '成立以来增长率',
  `custom_grow_rate` decimal(16,4) DEFAULT NULL COMMENT '自定义增长率',
  `nearly_1_year_wave_rate` decimal(16,4) DEFAULT NULL COMMENT '近1年波动率',
  `nearly_2_year_wave_rate` decimal(16,4) DEFAULT NULL COMMENT '近2年波动率',
  `nearly_3_year_wave_rate` decimal(16,4) DEFAULT NULL COMMENT '近3年波动率',
  `nearly_1_year_sharp_rate` decimal(16,4) DEFAULT NULL COMMENT '近1年夏普率',
  `nearly_2_year_sharp_rate` decimal(16,4) DEFAULT NULL COMMENT '近2年夏普率',
  `nearly_3_year_sharp_rate` decimal(16,4) DEFAULT NULL COMMENT '近3年夏普率',
  `establish_date` date DEFAULT NULL COMMENT '成立日期',
  `fund_manager` varchar(64) DEFAULT NULL COMMENT '基金经理',
  `manager_start_date` date DEFAULT NULL COMMENT '基金经理起始日期',
  `previous_fund_manager` varchar(64) DEFAULT NULL COMMENT '前任基金经理',
  `previous_manager_start_date` date DEFAULT NULL COMMENT '前任基金经理起始日期',
  `lock_period` decimal(16,4) DEFAULT NULL COMMENT '锁定期',
  `service_charge_rate` decimal(16,4) DEFAULT NULL COMMENT '手续费率',
  `discount_service_charge_rate` decimal(16,4) DEFAULT NULL COMMENT '打折手续费率',
  `discount_rate` decimal(16,4) DEFAULT NULL COMMENT '折扣率',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY idx_code (`fund_code`),
  KEY idx_manager (`fund_manager`),
  KEY idx_date (`fund_date`,`establish_date`),
  KEY idx_time (`create_time`,`update_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/**
4433法则是用来挑选基金的一种方式，即一只好的基金要同时满足以下条件：
1.近1年业绩排名在同类基金中位列前1/4；
2.近2/3/5年业绩排名在同类基金中位列前1/4；
3.近3个月业绩排名在同类基金中位列前1/3；
4.近6个月业绩排名在同类基金中位列前1/3。
 */
 
/**
  1.先按4433法则选出对应基金
  2.按基金名称排序和近1年增长率倒序排，根据近1年增长率高的和基金经理年限超过3年选出20~30只不同公司的基金，每家公司最多2只；
    根据近1年增长率高的和基金经理年限小于3年选出10只不同公司的基金，每家公司1只，选择初始爆发高的基金经理；
  3.支付宝查询基金分析指标，根据最大回撤、波动率、夏普比率选择
 */

/**
  1.模糊搜索查询主题表现好的基金，消费（白酒、消费）、医疗（中医、医疗）、新能源（汽车、光伏）、科技（科技、半导体）、中概（互联网）
  2.按基金名称排序和近1年增长率倒序排，根据近1年增长率高的和基金经理年限超过3年选出10~20只不同公司的基金，每家公司最多2只；
    根据近1年增长率高的和基金经理年限小于3年选出10只不同公司的基金，每家公司1只，选择初始爆发高的基金经理；
  3.支付宝查询基金分析指标，根据最大回撤、波动率、夏普比率选择
 */

SELECT COUNT(id) FROM fund_detail_info;

--1年 limit上面sql的值，大于等于取上面sql的值
SELECT (SELECT COUNT(id) FROM fund_detail_info WHERE nearly_1_year_grow_rate IS NOT NULL)/4;
SELECT MIN(a.nearly_1_year_grow_rate) FROM (SELECT * FROM fund_detail_info WHERE nearly_1_year_grow_rate IS NOT NULL ORDER BY nearly_1_year_grow_rate DESC LIMIT 1725) a;
SELECT fund_code FROM fund_detail_info WHERE nearly_1_year_grow_rate >= 26.6500;

--2年 limit上面sql的值，大于等于取上面sql的值
SELECT (SELECT COUNT(id) FROM fund_detail_info WHERE nearly_2_year_grow_rate IS NOT NULL)/4;
SELECT MIN(a.nearly_2_year_grow_rate) FROM (SELECT * FROM fund_detail_info WHERE nearly_2_year_grow_rate IS NOT NULL ORDER BY nearly_2_year_grow_rate DESC LIMIT 1368) a;
SELECT fund_code FROM fund_detail_info WHERE nearly_2_year_grow_rate >= 78.2000;

--3年 limit上面sql的值，大于等于取上面sql的值
SELECT (SELECT COUNT(id) FROM fund_detail_info WHERE nearly_3_year_grow_rate IS NOT NULL)/4;
SELECT MIN(a.nearly_3_year_grow_rate) FROM (SELECT * FROM fund_detail_info WHERE nearly_3_year_grow_rate IS NOT NULL ORDER BY nearly_3_year_grow_rate DESC LIMIT 1119) a;
SELECT fund_code FROM fund_detail_info WHERE nearly_3_year_grow_rate >= 125.3600;

--5年 limit上面sql的值，大于等于取上面sql的值
SELECT (SELECT COUNT(id) FROM fund_detail_info WHERE nearly_5_year_grow_rate IS NOT NULL)/4;
SELECT MIN(a.nearly_5_year_grow_rate) FROM (SELECT * FROM fund_detail_info WHERE nearly_5_year_grow_rate IS NOT NULL ORDER BY nearly_5_year_grow_rate DESC LIMIT 704) a;
SELECT fund_code FROM fund_detail_info WHERE nearly_5_year_grow_rate >= 115.3000;

--3月 limit上面sql的值，大于等于取上面sql的值
SELECT (SELECT COUNT(id) FROM fund_detail_info WHERE nearly_3_month_grow_rate IS NOT NULL)/3;
SELECT MIN(a.nearly_3_month_grow_rate) FROM (SELECT * FROM fund_detail_info WHERE nearly_3_month_grow_rate IS NOT NULL ORDER BY nearly_3_month_grow_rate DESC LIMIT 2807) a;
SELECT fund_code FROM fund_detail_info WHERE nearly_3_month_grow_rate >= 3.7500;

--6月 limit上面sql的值，大于等于取上面sql的值
SELECT (SELECT COUNT(id) FROM fund_detail_info WHERE nearly_6_month_grow_rate IS NOT NULL)/3;
SELECT MIN(a.nearly_6_month_grow_rate) FROM (SELECT * FROM fund_detail_info WHERE nearly_6_month_grow_rate IS NOT NULL ORDER BY nearly_6_month_grow_rate DESC LIMIT 2626) a;
SELECT fund_code FROM fund_detail_info WHERE nearly_6_month_grow_rate >= 11.1600;

--根据code查询近几年表现好的基金
SELECT * FROM fund_detail_info WHERE fund_code IN("100022","151001","260101","162202","162201","375010","481001","150103","040005","460001","519997","398001","240002","161903","510081","530001","288001","163804","040035","163803","165516","110013","519679","550002","166301","519003","090018","110009","310328","519704","240009","519089","020009","377240","370024","040025","040015","040011","540003","660015","519674","720001","550016","519005","519091","610002","163807","020023","519095","000390","398061","310368","000547","700003","270028","000308","000592","166801","519672","400015","000584","100029","550009","519702","001387","202027","000410","470098","373020","519017","166019","377530","519002","000409","610006","630016","481015","000209","000363","000362","519158","001410","519181","213006","000566","200015","519183","050010","000165","000404","162208","000126","001704","110012","290011","000742","163409","210003","519097","210008","162006","481017","080005","270021","540008","000336","121003","310358","000242","260111","660003","378010","410007","001694","257070","000612","519113","000259","000587","610004","370027","001606","350005","000124","750001","160624","450004","160610","379010","100039","481010","000541","519909","660004","000418","163822","519115","001938","000828","240022","002168","320018","000029","001298","000431","550008","000609","001811","000924","580009","002190","001643","000039","001018","000309","070021","001644","290008","519918","001487","519126","519195","519908","001616","519642","001716","001975","000729","001985","001445","519196","000698","519033","519727","217020","487021","420005","519133","000549","121010","206012","000991","001718","002939","690004","001542","690011","001224","001997","200012","000803","002770","165313","001677","001951","290014","550015","002771","770001","001887","000328","000689","376510","000534","000601","000967","000628","217012","090009","000756","001156","001736","163810","001070","000219","001471","002083","002084","002482","163818","040007","001054","630008","487016","001538","001869","001827","121008","000940","001287","002556","000739","398051","000120","582003","001907","000462","001809","673060","001388","001069","519025","002132","002669","001701","002036","001908","001858","001702","002537","000976","002296","001955","001864","001279","001740","001245","161611","001480","002213","002148","519644","001822","160919","000985","000433","001692","001072","000788","002542","001933","002844","210005","001479","001339","001009","001990","001719","000327","519767","002291","001008","002095","001482","167001","002096","001300","161222","501001","001956","001808","002681","002256","000690","160518","000793","001569","165520","001000","001672","001301","001681","002281","001959","002682","000603","160225","519773","001236","001978","001252","398021","270022","161028","001323","002170","001709","003165","001039","002604","003166","003145","002955","002272","001476","470021","001753","001126","002938","001667","001924","001373","481006","400032","000928","350007","001220","001475","001366","001037","001158","001276","000823","001534","001515","001166","160813","001143","001267","001125","001120","161217","001121","502000","257060")
AND nearly_3_month_grow_rate > 10.00 AND nearly_6_month_grow_rate > 20.00 AND nearly_1_year_grow_rate > 50.00
AND nearly_2_year_grow_rate > 100.00 AND nearly_3_year_grow_rate > 200.00 AND nearly_5_year_grow_rate >300.00;

--模糊搜索查询表现好的基金
SELECT fund_code,fund_name,nearly_1_month_grow_rate,nearly_3_month_grow_rate,nearly_6_month_grow_rate,
nearly_1_year_grow_rate,nearly_2_year_grow_rate,nearly_3_year_grow_rate,nearly_5_year_grow_rate
FROM fund_detail_info WHERE fund_name LIKE '%消费%'
AND nearly_3_month_grow_rate > 10.00 AND nearly_6_month_grow_rate > 20.00 AND nearly_1_year_grow_rate > 50.00
AND nearly_2_year_grow_rate > 100.00 AND nearly_3_year_grow_rate > 200.00 AND nearly_5_year_grow_rate >300.00
ORDER BY nearly_3_year_grow_rate DESC, nearly_1_year_grow_rate DESC, nearly_3_month_grow_rate DESC;