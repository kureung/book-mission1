package io.github.kureung.book.numbersComparator.numberComparator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PageTest {

    @Test
    void 곱셈과_덧셈_중_더_큰_값을_반환한다() {
        Page page = new Page(97);
        assertThat(page.greaterResult()).isEqualTo(63);
    }
}
