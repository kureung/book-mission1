package io.github.kureung.book;

import java.util.List;

public class NumbersComparatorFactory {

    private final List<Integer> numbers;

    public NumbersComparatorFactory(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public NumbersComparator numbersComparator() {
        if (numbers.size() != 2) {
            throw new IllegalStateException();
        }

        return new NumbersComparator(numbers.get(0), numbers.get(1));
    }

}
