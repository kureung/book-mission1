package io.github.kureung.book.pages;

import java.util.List;

public class PagesFactory {

    private final List<Integer> numbers;

    public PagesFactory(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Pages pages() {
        if (numbers.size() != 2) {
            throw new IllegalStateException();
        }

        return new Pages(numbers.get(0), numbers.get(1));
    }

}
