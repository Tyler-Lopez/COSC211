package com.company;

public class p18_25 {
    public static void doProblem() {
        displayPermutation("abc");
    }
    public static void displayPermutation(String s) {
        displayPermutation("",s);

    }
    public static void displayPermutation(String s1, String s2) {
        int s2Length = s2.length();
        if(s2Length == 0) System.out.println(s1);
        else {
            for(int i = 0; i < s2Length; i ++) {
                System.out.println("HERE: " + s2 + " | THERE: " + s1);
                displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
            }
        }
    }
}
