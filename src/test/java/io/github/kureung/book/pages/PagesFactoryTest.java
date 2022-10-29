package io.github.kureung.book.pages;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PagesFactoryTest {

    @Test
    void 숫자들_비교자를_생성할_수_있다() {
        PagesFactory pagesFactory = new PagesFactory(List.of(97, 98));

        assertThat(pagesFactory.numbersComparator()).isEqualTo(new Pages(97, 98));
    }
}
