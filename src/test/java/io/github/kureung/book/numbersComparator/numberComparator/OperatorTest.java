package io.github.kureung.book.numbersComparator.numberComparator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class OperatorTest {

    @Test
    void 더할_수_있다() {
        assertThat(Operator.ADDITION.calculatedResult(List.of(1, 2))).isEqualTo(3);
    }

    @Test
    void 곱할_수_있다() {
        assertThat(Operator.MULTIPLICATION.calculatedResult(List.of(1, 2))).isEqualTo(2);
    }
}
