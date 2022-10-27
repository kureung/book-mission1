package io.github.kureung.book;

import java.util.List;

import static io.github.kureung.book.Operator.ADDITION;
import static io.github.kureung.book.Operator.MULTIPLICATION;

public class NumberComparator {

    private final NumberParser numberParser;

    public NumberComparator(int number) {
        this(new NumberParser(number));
    }

    public NumberComparator(NumberParser numberParser) {
        this.numberParser = numberParser;
    }

    public int greaterResult() {
        List<Integer> numbers = numberParser.parsedNumbers();
        return Math.max(ADDITION.calculatedResult(numbers), MULTIPLICATION.calculatedResult(numbers));
    }
}
