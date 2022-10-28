package io.github.kureung.book.numbersComparator;

import java.util.List;

public class NumbersComparatorFactory {

    private final List<Integer> numbers;

    public NumbersComparatorFactory(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Pages numbersComparator() {
        if (numbers.size() != 2) {
            throw new IllegalStateException();
        }

        return new Pages(numbers.get(0), numbers.get(1));
    }

}
