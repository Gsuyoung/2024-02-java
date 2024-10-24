package com.green.day12.blackjack;

public class Card {
    private final String pattern; //무늬
    private final String denomination; //A, 2~10, J, Q, K 값 저장


    //setter없이 생성자만을 사용한 의도 : immutable(값을 변경하지 않기위해)하게 하고싶어서
    public Card (final String pattern, final String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return  denomination;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)",pattern,denomination);
    }
}
