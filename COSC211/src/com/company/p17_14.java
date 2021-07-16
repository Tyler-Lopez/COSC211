package com.company;

/*
(Encrypt files)
Encode the file by adding 5 to every byte in the file.
Write a program that prompts the user to enter an input file name and an output file name and saves the encrypted version of the input file to the output file.
 */

import java.io.*;

public class p17_14 {
    public static void doProblem() throws Exception {
        // We are omitting the scanner here for simplicity.
        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src\\data\\Exercise17_14_01.txt")))
        {
            char a = 'a';
            for(int i = 0; i < 100; i ++) bufferedOutputStream.write(a);
        }
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src\\data\\Exercise17_14_01.txt"))) {
            try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src\\data\\Exercise17_14_02.txt"))) {
                int value;
                while((value = bufferedInputStream.read()) != -1) bufferedOutputStream.write(value + (byte) 5);
            }
        }
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src\\data\\Exercise17_14_02.txt"))) {
            try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src\\data\\Exercise17_14_03.txt"))) {
                int value;
                while((value = bufferedInputStream.read()) != -1) bufferedOutputStream.write(value - (byte) 5);
            }
        }
    }
}
