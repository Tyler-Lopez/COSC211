package com.company;

/*
(Encrypt files)
Encode the file by adding 5 to every byte in the file.
Write a program that prompts the user to enter an input file name and an output file name and saves the encrypted version of the input file to the output file.
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class p17_16 {
    public static void doProblem() throws Exception {
        // We are omitting the scanner here for simplicity.
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("src\\data\\Exercise17_16_01"))) {
            for (int i = 0; i < 26; i++) outputStream.write('i');
        }
    }
}
