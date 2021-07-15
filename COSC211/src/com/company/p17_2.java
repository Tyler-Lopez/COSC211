package com.company;

import java.io.*;

/*
(Create a binary data file) Write a program to create a file named Exercise17_02.dat if it does not exist. Append new data to it if it already exists.
Write 100 integers created randomly into the file using binary I/O.
 */
public class p17_2 {
    public static void doProblem() throws Exception {
        FileOutputStream outputStream = new FileOutputStream("src\\data\\Exercise17_02.dat", true);
        for(int i = 0; i < 100; i ++) outputStream.write((int)(Math.random()*127));
    }
}
