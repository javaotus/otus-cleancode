package ru.otus.example.cleancode.lesson1.bulky.services;

import ru.otus.example.cleancode.lesson1.bulky.models.WikiPage;
import ru.otus.example.cleancode.lesson1.bulky.models.WikiPagePath;

public interface PageCrawler {


    WikiPagePath getFullPath(WikiPage suiteSetup);

}
