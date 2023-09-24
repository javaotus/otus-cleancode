package ru.otus.example.cleancode.lesson1.compact;

import ru.otus.example.cleancode.lesson1.bulky.models.PageData;
import ru.otus.example.cleancode.lesson1.bulky.models.WikiPage;

import static ru.otus.example.cleancode.lesson1.compact.PageDataExtractors.includeSetupPages;
import static ru.otus.example.cleancode.lesson1.compact.PageDataExtractors.includeTeardownPages;

public class HtmlUtils {

    public static String testableHtml(PageData pageData, boolean includeSuiteSetup) {

        WikiPage wikiPage = pageData.getWikiPage();

        StringBuilder buffer = new StringBuilder();

        includeSetupPages(pageData, includeSuiteSetup, wikiPage, buffer);

        buffer.append(pageData.getContent());

        includeTeardownPages(pageData, includeSuiteSetup, wikiPage, buffer);

        pageData.setContent(buffer.toString());

        return pageData.getHtml();

    }

}