package com.company;

public class p18_11 {
    public static void doProblem() {
        System.out.println(sumDigits(1111111111111111L));
    }
    public static int sumDigits(long n) {
        if(n == 0) return 0;
        return (int) (n % 10 + sumDigits(n / 10));
    }
}
