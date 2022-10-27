package io.github.kureung.book.service;

import io.github.kureung.book.numbersComparator.NumbersComparator;
import io.github.kureung.book.numbersComparator.NumbersComparatorFactory;

import java.util.List;

public class ComparatorService {

    private final NumbersComparator numbersComparator;

    private final NumbersComparator otherNumbersComparator;

    private ComparatorService(NumbersComparator numbersComparator, NumbersComparator otherNumbersComparator) {
        this.numbersComparator = numbersComparator;
        this.otherNumbersComparator = otherNumbersComparator;
    }

    public static ComparatorService of(List<Integer> numbers, List<Integer> otherNumbers) {
        NumbersComparator numbersComparator = new NumbersComparatorFactory(numbers).numbersComparator();
        NumbersComparator otherNumbersComparator = new NumbersComparatorFactory(otherNumbers).numbersComparator();

        return new ComparatorService(numbersComparator, otherNumbersComparator);
    }


    public boolean isGreaterNumbers() {
        return numbersComparator.greaterResult() > otherNumbersComparator.greaterResult();
    }

    public boolean isGreaterOtherNumbers() {
        return numbersComparator.greaterResult() < otherNumbersComparator.greaterResult();
    }

    public boolean isSameNumbers() {
        return numbersComparator.greaterResult() == otherNumbersComparator.greaterResult();
    }
}

