package io.github.kureung;

import io.github.kureung.book.service.ComparatorService;

import java.util.List;

public class Problem1 {

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        // TODO : 유효성 검증 로직

        ComparatorService comparatorService = ComparatorService.of(pobi, crong);

        if (comparatorService.isGreaterNumbers()) {
            return 1;
        }

        if (comparatorService.isGreaterOtherNumbers()) {
            return 2;
        }

        if (comparatorService.isSameNumbers()) {
            return 0;
        }

        return -1;
    }
}
