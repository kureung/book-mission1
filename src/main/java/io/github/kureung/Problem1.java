package io.github.kureung;

import io.github.kureung.book.service.BookService;

import java.util.List;

public class Problem1 {

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        // TODO : 유효성 검증 로직

        BookService bookService = BookService.of(pobi, crong);

        if (bookService.isGreaterNumbers()) {
            return 1;
        }

        if (bookService.isGreaterOtherNumbers()) {
            return 2;
        }

        if (bookService.isSameNumbers()) {
            return 0;
        }

        return -1;
    }
}
