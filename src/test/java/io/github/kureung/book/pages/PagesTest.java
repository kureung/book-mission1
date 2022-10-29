package io.github.kureung.book.pages;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PagesTest {

    @Test
    void 두_수의_연산값_중_더_큰_값을_반환한다() {
        Pages pages = new Pages(97, 98);
        assertThat(pages.greaterResult()).isEqualTo(72);
    }


    @MethodSource
    @ParameterizedTest
    void 승부를_결과를_반환할_수_있다(Pages pages, Pages otherPages, MatchResult matchResult) {
        assertThat(pages.matchResult(otherPages)).isEqualTo(matchResult);
    }

    private static Stream<Arguments> 승부를_결과를_반환할_수_있다() {
        return Stream.of(
                Arguments.of(new Pages(97, 98), new Pages(197, 198), MatchResult.DRAW),
                Arguments.of(new Pages(97, 98), new Pages(22, 23), MatchResult.WIN),
                Arguments.of(new Pages(22, 23), new Pages(97, 98), MatchResult.LOSE)
        );
    }

}
