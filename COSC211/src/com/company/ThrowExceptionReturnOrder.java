package com.company;

public class ThrowExceptionReturnOrder {
    public static int doProblem() {
        try {
        return 5;
        } catch(Exception ex) {
        } finally {
            System.out.print("We made it here"); // This happens BEFORE THE RETURN!
        }
        return 6;
    }
}
