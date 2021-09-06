package com.lyh.fund.scrapy;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * Created by lvyanghui
 * 2021/9/5 21:35
 */
public class GithubRepoPageProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000)
            .setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36");

    @Override
    public void process(Page page) {
        System.out.println(page.getHtml());
        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/[\\w\\-]+/[\\w\\-]+)").all());
        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/[\\w\\-])").all());
        page.putField("author", page.getUrl().regex("https://github\\.com/(\\w+)/.*").toString());
        page.putField("name", page.getHtml().xpath("//h1[@class='entry-title public']/strong/a/text()").toString());
        if (page.getResultItems().get("name")==null){
            //skip this page
            page.setSkip(true);
        }
        page.putField("readme", page.getHtml().xpath("//div[@id='readme']/tidyText()"));
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new GithubRepoPageProcessor()).addUrl("http://fund.eastmoney.com/data/fundranking.html#tall;c0;r;slnzf;pn10000;ddesc;qsd20191210;qed20201210;qdii;zq;gg;gzbd;gzfs;bbzt;sfbb")
                .addPipeline(new ConsolePipeline()).run();
    }
}
