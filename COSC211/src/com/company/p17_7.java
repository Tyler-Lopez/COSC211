package com.company;

/*
(Restore objects from a file)
Suppose a file named Exercise17_06.dat has been created using the ObjectOutputStream from the preceding programming exercises. The file contains Loan Objects.
The Loan class in Listing 10.2 does not implement Serializable. Rewrite the Loan class to implement Serializable. Rewrite the Loan class to implement Serializable.
Write a program that reads the Loan objects from the file and displays the total loan amount.
Suppose that you don't know how many Loan objects there are in the file, use EOFException to end the loop.
 */

import java.io.*;
import java.util.Date;

public class p17_7 {
    public static void doProblem() throws Exception {
        System.out.println("\nStart of Problem 17.7");
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src\\data\\Exercise17_06.dat"))) {
            while(true) {
                    p17_6.Loan loan = (p17_6.Loan) inputStream.readObject();
                    System.out.println(loan.getLoanAmount());
            }
        } catch(EOFException ex) {
            System.out.print("Poor form, swallowing exception to exit.");
        }
    }
}
