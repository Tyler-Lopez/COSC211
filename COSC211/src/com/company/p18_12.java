package com.company;

public class p18_12 {
    public static void doProblem() {
        reverseDisplay("Hello there senor");
    }

    public static void reverseDisplay(String value) {
        reverseDisplay(value, value.length() - 1);
    }

    public static void reverseDisplay(String value, int high) {
        if (high < 0) return;
        System.out.print(value.charAt(high));
        reverseDisplay(value, high - 1);

    }
}
