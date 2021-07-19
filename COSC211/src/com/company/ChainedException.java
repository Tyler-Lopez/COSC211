package com.company;

public class ChainedException {
    public static void doProblem() {
        try {
            method1();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void method1() throws Exception {
        try{
            method2();
        } catch(Exception ex) {
            throw new Exception("New info from method1", ex);
        }
    }
    public static void method2() throws Exception {
        throw new Exception("Method 2 exception");
    }
}
