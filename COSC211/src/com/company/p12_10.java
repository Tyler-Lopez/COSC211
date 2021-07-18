package com.company;

import java.util.ArrayList;

public class p12_10 {
    public static void doProblem() {
        ArrayList<Long> longList = new ArrayList<Long>();
        try {
            while (1 != 0) {
                try {
                    longList.add(Long.MAX_VALUE);
                } catch(OutOfMemoryError ex) {
                    break;
                }
            }
         } catch(OutOfMemoryError ex) {
            System.out.println("Here");
            System.out.println(ex.getMessage());
        }
        System.out.println("Here");
    }
}
