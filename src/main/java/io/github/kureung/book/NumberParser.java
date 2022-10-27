package io.github.kureung.book;

import java.util.ArrayList;
import java.util.List;

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

}
