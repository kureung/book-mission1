package io.github.kureung.book.numbersComparator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumbersComparatorTest {

    @Test
    void 두_수의_연산값_중_더_큰_값을_반환한다() {
        NumbersComparator numbersComparator = new NumbersComparator(97, 98);
        assertThat(numbersComparator.greaterResult()).isEqualTo(72);
    }
}
