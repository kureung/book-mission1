package io.github.kureung.book;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberComparator that = (NumberComparator) o;
        return Objects.equals(numberParser, that.numberParser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberParser);
    }
}
