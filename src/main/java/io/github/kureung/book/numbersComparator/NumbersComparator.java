package io.github.kureung.book.numbersComparator;

import io.github.kureung.book.numbersComparator.numberComparator.Page;

import java.util.Objects;

public class NumbersComparator {

    private final Page page;
    private final Page otherPage;

    NumbersComparator(int number, int otherNumber) {
        this(new Page(number), new Page(otherNumber));
    }

    NumbersComparator(Page page, Page otherPage) {
        this.page = page;
        this.otherPage = otherPage;
    }

    public int greaterResult() {
        return Math.max(page.greaterResult(), otherPage.greaterResult());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumbersComparator that = (NumbersComparator) o;
        return Objects.equals(page, that.page) && Objects.equals(otherPage, that.otherPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, otherPage);
    }
}
