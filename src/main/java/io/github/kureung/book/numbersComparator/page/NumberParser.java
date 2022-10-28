package io.github.kureung.book.numbersComparator.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NumberParser {

    private static final int DIVIDER = 10;

    private final int number;


    public NumberParser(int number) {
        this.number = number;
    }

    public List<Integer> parsedNumbers() {
        return recursion(number, new ArrayList<>());
    }

    private List<Integer> recursion(int number, List<Integer> numbers) {
        if (number > 0) {
            numbers.add(number % DIVIDER);
            recursion(number / DIVIDER, numbers);
        }

        return numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberParser that = (NumberParser) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
