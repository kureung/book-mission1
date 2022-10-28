package io.github.kureung.book.numbersComparator.page;

import java.util.List;
import java.util.function.BinaryOperator;

public enum Operator {
    ADDITION((a, b) -> a + b),
    MULTIPLICATION((a, b) -> a * b),
    ;

    private final BinaryOperator<Integer> formula;

    Operator(BinaryOperator<Integer> formula) {
        this.formula = formula;
    }

    public int calculatedResult(List<Integer> numbers) {
        return numbers.stream()
                .reduce(formula)
                .orElse(0);
    }
}
