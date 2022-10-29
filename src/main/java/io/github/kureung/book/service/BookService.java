package io.github.kureung.book.service;

import io.github.kureung.book.pages.Pages;
import io.github.kureung.book.pages.PagesFactory;

import java.util.List;

public class BookService {

    private final Pages pages;

    private final Pages otherPages;

    private BookService(Pages pages, Pages otherPages) {
        this.pages = pages;
        this.otherPages = otherPages;
    }

    public static BookService of(List<Integer> numbers, List<Integer> otherNumbers) {
        Pages pages = new PagesFactory(numbers).numbersComparator();
        Pages otherPages = new PagesFactory(otherNumbers).numbersComparator();

        return new BookService(pages, otherPages);
    }


    public boolean isGreaterNumbers() {
        return pages.greaterResult() > otherPages.greaterResult();
    }

    public boolean isGreaterOtherNumbers() {
        return pages.greaterResult() < otherPages.greaterResult();
    }

    public boolean isSameNumbers() {
        return pages.greaterResult() == otherPages.greaterResult();
    }
}

