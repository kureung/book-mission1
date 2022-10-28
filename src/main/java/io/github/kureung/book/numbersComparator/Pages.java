package io.github.kureung.book.numbersComparator;

import io.github.kureung.book.numbersComparator.page.Page;

import java.util.Objects;

public class Pages {

    private final Page page;
    private final Page otherPage;

    Pages(int number, int otherNumber) {
        this(new Page(number), new Page(otherNumber));
    }

    Pages(Page page, Page otherPage) {
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
        Pages that = (Pages) o;
        return Objects.equals(page, that.page) && Objects.equals(otherPage, that.otherPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, otherPage);
    }
}
