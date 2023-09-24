package ru.otus.example.cleancode.lesson1.compact;

import ru.otus.example.cleancode.lesson1.bulky.models.PageData;
import ru.otus.example.cleancode.lesson1.bulky.models.PathParser;
import ru.otus.example.cleancode.lesson1.bulky.models.WikiPage;
import ru.otus.example.cleancode.lesson1.bulky.models.WikiPagePath;
import ru.otus.example.cleancode.lesson1.bulky.services.PageCrawlerImpl;

public class PageDataExtractors {

    public static void includeTeardownPages(PageData pageData, boolean includeSuiteSetup, WikiPage wikiPage, StringBuilder buffer) {

        if (pageData.hasAttribute("Test")) {

            WikiPage teardown = PageCrawlerImpl.getInheritedPage("TearDown", wikiPage);

            if (teardown != null) {
                WikiPagePath tearDownPath = wikiPage.getPageCrawler().getFullPath(teardown);
                String tearDownPathName = PathParser.render(tearDownPath);
                buffer.append("\n").append("!include -teardown .").append(tearDownPathName).append("\n");
            }

            if (includeSuiteSetup) {

                WikiPage suiteTeardown = PageCrawlerImpl.getInheritedPage("SUITE_TEARDOWN_NAME", wikiPage);

                if (suiteTeardown != null) {

                    WikiPagePath pagePath = suiteTeardown.getPageCrawler().getFullPath (suiteTeardown);
                    String pagePathName = PathParser.render(pagePath);
                    buffer.append("!include -teardown .").append(pagePathName).append("\n");
                }
            }

        }
    }

    public static void includeSetupPages(PageData pageData, boolean includeSuiteSetup, WikiPage wikiPage, StringBuilder buffer) {

        if (pageData.hasAttribute("Test")) {

            if (includeSuiteSetup) {
                WikiPage suiteSetup = PageCrawlerImpl.getInheritedPage("SuiteResponder", wikiPage);

                if (suiteSetup != null) {
                    WikiPagePath pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
                    String pagePathName = PathParser.render(pagePath);
                    buffer.append("!include -setup .").append(pagePathName).append("\n");
                }
            }

            WikiPage setup = PageCrawlerImpl.getInheritedPage("SetUp", wikiPage);

            if (setup != null) {
                WikiPagePath setupPath = wikiPage.getPageCrawler().getFullPath(setup);
                String setupPathName = PathParser.render(setupPath);
                buffer.append("!include -setup .").append(setupPathName).append("\n");
            }

        }
    }

}
