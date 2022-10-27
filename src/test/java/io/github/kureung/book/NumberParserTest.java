package io.github.kureung.book;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberParserTest {

    @Test
    void 숫자를_자리수로_쪼갤_수_있다() {
        NumberParser numberParser = new NumberParser(12);
        assertThat(numberParser.parsedNumbers()).contains(1, 2);
    }
}
