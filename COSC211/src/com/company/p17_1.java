package com.company;

/* (Create a text file) Write a program to create a file named Exercise17_01.txt if it does not exist.
Append new data to it if it already exists.
Write 100 integers created randomly into the file using text I/O.
Integers are separated by a space.
 */


import java.io.*;

public class p17_1 {
    public static void doProblem() throws IOException {
        // Create a file named Exercise 17_01.txt if it doesn't exist.
        FileWriter output = new FileWriter("src\\data\\Exercise17_01.txt", true);
        for(int i = 0; i < 100; i++) output.write((int)(Math.random()*101)+" ");
        output.write("\n");
        output.close();
    }
}
