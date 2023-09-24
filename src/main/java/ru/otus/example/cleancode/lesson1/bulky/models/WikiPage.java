package ru.otus.example.cleancode.lesson1.bulky.models;

import ru.otus.example.cleancode.lesson1.bulky.services.PageCrawler;

public class WikiPage {

    private PageCrawler pageCrawler;


    public PageCrawler getPageCrawler() {
        return pageCrawler;
    }

    public void setPageCrawler(PageCrawler pageCrawler) {
        this.pageCrawler = pageCrawler;
    }

}
