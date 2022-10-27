package io.github.kureung.book;

public class NumbersComparator {

    private final NumberComparator numberComparator;
    private final NumberComparator otherNumberComparator;

    public NumbersComparator(int number, int otherNumber) {
        this(new NumberComparator(number), new NumberComparator(otherNumber));
    }

    public NumbersComparator(NumberComparator numberComparator, NumberComparator otherNumberComparator) {
        this.numberComparator = numberComparator;
        this.otherNumberComparator = otherNumberComparator;
    }

    public int greaterResult() {
        return Math.max(numberComparator.greaterResult(), otherNumberComparator.greaterResult());
    }

}
