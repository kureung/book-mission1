package io.github.kureung;

import io.github.kureung.book.pages.Pages;
import io.github.kureung.book.pages.PagesFactory;

import java.util.List;

public class Problem1 {

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        // TODO : 유효성 검증 로직

        Pages pobiPages = new PagesFactory(pobi).pages();
        Pages crongPages = new PagesFactory(crong).pages();
        return pobiPages.matchResult(crongPages).value();
    }
}
