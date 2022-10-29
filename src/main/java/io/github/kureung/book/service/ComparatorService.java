package io.github.kureung.book.service;

import io.github.kureung.book.numbersComparator.Pages;
import io.github.kureung.book.numbersComparator.PagesFactory;

import java.util.List;

public class ComparatorService {

    private final Pages pages;

    private final Pages otherPages;

    private ComparatorService(Pages pages, Pages otherPages) {
        this.pages = pages;
        this.otherPages = otherPages;
    }

    public static ComparatorService of(List<Integer> numbers, List<Integer> otherNumbers) {
        Pages pages = new PagesFactory(numbers).numbersComparator();
        Pages otherPages = new PagesFactory(otherNumbers).numbersComparator();

        return new ComparatorService(pages, otherPages);
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

