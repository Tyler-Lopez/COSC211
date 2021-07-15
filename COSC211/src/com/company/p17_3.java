package com.company;

import java.io.*;

/*
(Sum all the integers in a binary data file)
Suppose a binary data file named Exercise17_02.dat has been created from Programming Exercise 17.2 and its data are created using writeInt(int) in DataOutputStream.
The file contains an unspecified number of integers. Write a program to find the sum of the integers.
 */

public class p17_3 {
    public static void doProblem() throws Exception {
        FileInputStream inputStream = new FileInputStream("src\\data\\Exercise17_02.dat");
        int value;
        int sum = 0;
        while((value = inputStream.read()) != -1) { // -1 Signifies the end of a file... but how is -1 stored?
            System.out.println("Value is " + value);
            sum += value;
        }
        System.out.println("FINAL VALUE: " + sum);
    }
}
