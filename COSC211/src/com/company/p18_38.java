package com.company;

public class p18_38 {

    public static final int SPACES = 160;
    public static void doProblem() {
        printBranches(5);

    }
    public static void printBranches(int branches) {
        int locationOfItem = SPACES / (branches + 1);
        for(int j = 0; j < 5; j++) {
            for (int i = 1; i < SPACES; i++) {
                if (i % locationOfItem == 0) System.out.print("|");
                else System.out.print(' ');
            }
            System.out.println();
        }
        if(branches != 1) printBranches(branches - 1);
    }

}
