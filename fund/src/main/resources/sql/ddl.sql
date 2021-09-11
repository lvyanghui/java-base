CREATE TABLE `fund_detail_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `fund_code` varchar(16) DEFAULT NULL COMMENT '基金代码',
  `fund_name` varchar(32) DEFAULT NULL COMMENT '基金简称',
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

SELECT COUNT(*) FROM fund_detail_info;
SELECT * FROM fund_detail_info WHERE nearly_1_year_grow_rate IS NOT NULL ORDER BY nearly_1_year_grow_rate DESC LIMIT 0,2211;