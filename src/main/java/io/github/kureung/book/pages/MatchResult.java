package io.github.kureung.book.pages;

public enum MatchResult {
    WIN(1),
    LOSE(2),
    DRAW(0),
    ;

    private final int value;

    MatchResult(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

}
