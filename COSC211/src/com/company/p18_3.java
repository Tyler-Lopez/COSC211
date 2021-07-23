package com.company;

import java.util.Scanner;

public class p18_3 {
    public static Scanner input = new Scanner(System.in);
    public static void doProblem() {
        System.out.println("Enter one integer.");
        int value1 = input.nextInt();
        System.out.println("Enter another integer.");
        int value2 = input.nextInt();
        System.out.println(recursionGCD(value1, value2));
    }
    public static int recursionGCD(int value1, int value2) {
        if(value2 > value1) return recursionGCD(value1, value2, value1);
        else return recursionGCD(value1, value2, value2);
    }
    public static int recursionGCD(int value1, int value2, int gcd) {
        if(value1 % gcd == 0 && value2 % gcd == 0) return gcd;
        else return recursionGCD(value1, value2, gcd-1);
    }
}
