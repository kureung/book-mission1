package io.github.kureung.book;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class OperatorTest {

    @Test
    void 더할_수_있다() {
        assertThat(Operator.ADDITION.calculatedResult(List.of(1, 2))).isEqualTo(3);
    }

}
