package com.dreamest.wargame_basic;

public class Card implements Comparable<Card>{
    private int value;
    private String suit;
    private String drawableName;
    private final int VALUE_OFFSET = -2;

    public Card(){};

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
        this.drawableName = suit + "_" + valueToWord(value);
    }

    private String valueToWord(int value) {
        String words[] = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
        return words[value + VALUE_OFFSET];
    }

    @Override
    public int compareTo(Card other) {
        return this.value - other.value;
//        if (this.value > other.value)
//            return 1;
//        else if (this.value < other.value)
//            return -1;
//        return 0;
    }

    public String getName() {
        return this.drawableName;
    }
}
