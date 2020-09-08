package com.example.demo;

public class StringToInt {

    private String text;

    private int textLength;

    public StringToInt() {}

    public StringToInt(String text) {
        this.text = text;
        this.textLength = text.length();
    }

    public String removeAlphabet() {
        String result = "";

        for (int index = 0; index < this.textLength; index++) {
            char ch = this.text.charAt(index);
            if (ch >= '0' && ch <= '9') {
                result = result + ch;
            }
        }

        return  result;
    }

    public int ConvertToInt() {
        int result = 0, factor = 1;
        String numberString = removeAlphabet();

        for (int index = numberString.length() - 1; index >= 0; index--) {
            result += (numberString.charAt(index) - '0') * factor;
            factor *= 10;
        }

        return result;
    }

}