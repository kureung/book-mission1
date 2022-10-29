package io.github.kureung.book.pages;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PagesTest {

    @Test
    void 두_수의_연산값_중_더_큰_값을_반환한다() {
        Pages pages = new Pages(97, 98);
        assertThat(pages.greaterResult()).isEqualTo(72);
    }
}
