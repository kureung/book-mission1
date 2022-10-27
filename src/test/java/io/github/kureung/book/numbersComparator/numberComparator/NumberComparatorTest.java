package io.github.kureung.book.numbersComparator.numberComparator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberComparatorTest {

    @Test
    void 곱셈과_덧셈_중_더_큰_값을_반환한다() {
        NumberComparator numberComparator = new NumberComparator(97);
        assertThat(numberComparator.greaterResult()).isEqualTo(63);
    }
}
