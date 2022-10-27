package io.github.kureung.book;

import java.util.Objects;

public class NumbersComparator {

    private final NumberComparator numberComparator;
    private final NumberComparator otherNumberComparator;

    NumbersComparator(int number, int otherNumber) {
        this(new NumberComparator(number), new NumberComparator(otherNumber));
    }

    NumbersComparator(NumberComparator numberComparator, NumberComparator otherNumberComparator) {
        this.numberComparator = numberComparator;
        this.otherNumberComparator = otherNumberComparator;
    }

    public int greaterResult() {
        return Math.max(numberComparator.greaterResult(), otherNumberComparator.greaterResult());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumbersComparator that = (NumbersComparator) o;
        return Objects.equals(numberComparator, that.numberComparator) && Objects.equals(otherNumberComparator, that.otherNumberComparator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberComparator, otherNumberComparator);
    }
}
