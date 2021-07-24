package com.company;

public class p18_2 {
    public static int fibCount = 0;
    public static void doProblem() {
        System.out.println(fibRecursion(18));
        System.out.println(fibIteration(18));
    }
    public static long fibRecursion(int index) {
        System.out.println("fibRecursion called " + ++fibCount + " times.");
        return index == 0 ? 0 : index == 1 ? 1 : fibRecursion(index - 2) + fibRecursion(index -1);
    }
    public static long fibIteration(int index) {
        long fib0 = 0;
        long fib1 = 1;
        long tmpFib = 1;
        for(int i = 0; i <= index - 2; i ++) {
            tmpFib = fib0 + fib1;
            fib0 = fib1;
            fib1 = tmpFib;
        }
        return tmpFib;
    }
}
