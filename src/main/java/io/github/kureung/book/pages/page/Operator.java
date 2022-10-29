package io.github.kureung.book.pages.page;

import java.util.List;
import java.util.function.BinaryOperator;

enum Operator {
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
