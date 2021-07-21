package com.company;

public class RecursionPractice {
    public static void doProblem() {
        int n = 1;
        System.out.println("Factorial of " + n + " is " + factorial(n));
        System.out.println(isPalindrome("mom"));

    }
    public static long factorial(int n) {
        if (n == 0) return 1;
        else return n * factorial(n-1);
    }
    public static boolean isPalindrome(String s) {
        if(s.length() == 1) return true;
        System.out.println("mid check " + s);
        if(s.charAt(0)==s.charAt(s.length()-1)) return isPalindrome(s.substring(1,s.length()-1));
        else return false;
    }
}
