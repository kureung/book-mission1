package io.github.kureung.book.numbersComparator.numberComparator;

import java.util.List;
import java.util.Objects;

import static io.github.kureung.book.numbersComparator.numberComparator.Operator.ADDITION;
import static io.github.kureung.book.numbersComparator.numberComparator.Operator.MULTIPLICATION;

public class Page {

    private final NumberParser numberParser;

    public Page(int number) {
        this(new NumberParser(number));
    }

    public Page(NumberParser numberParser) {
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
        Page that = (Page) o;
        return Objects.equals(numberParser, that.numberParser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberParser);
    }
}
