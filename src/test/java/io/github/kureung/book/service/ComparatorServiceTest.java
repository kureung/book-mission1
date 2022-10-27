package io.github.kureung.book.service;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ComparatorServiceTest {

    @Test
    void numbers_가_더_크면_참을_반환한다() {
        ComparatorService comparatorService = ComparatorService.of(List.of(131, 132), List.of(211, 212));

        assertTrue(comparatorService.isGreaterNumbers());
    }

    @Test
    void otherNumber_가_더_크면_참을_반환한다() {
        ComparatorService comparatorService = ComparatorService.of(List.of(12, 13), List.of(45, 46));

        assertTrue(comparatorService.isGreaterOtherNumbers());
    }

    @Test
    void 서로_같으면_참을_반환한다() {
        ComparatorService comparatorService = ComparatorService.of(List.of(97, 98), List.of(197, 198));

        assertTrue(comparatorService.isSameNumbers());
    }
}
