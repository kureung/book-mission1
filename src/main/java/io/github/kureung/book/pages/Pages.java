package io.github.kureung.book.pages;

import io.github.kureung.book.pages.page.Page;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Pages {

    private final List<Page> pages;

    Pages(int number, int otherNumber) {
        this(List.of(new Page(number), new Page(otherNumber)));
    }

    public Pages(List<Page> pages) {
        this.pages = pages;
    }

    public int greaterResult() {
        Page page = pages.stream()
                .max(Comparator.comparingInt(Page::greaterResult))
                .orElseThrow();

        return page.greaterResult();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pages pages1 = (Pages) o;
        return Objects.equals(pages, pages1.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages);
    }
}
