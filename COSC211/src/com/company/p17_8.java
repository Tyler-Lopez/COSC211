package com.company;

/*
(Update count)
Suppose that you wish to track how many times a program has been executed.
You can store an int to count the file. Increase the count by 1 each time this program is executed. Let the program be Exercise17_08.txt and store the count in Exercise17_08.dat
 */

import java.io.*;

public class p17_8 {
    public static void doProblem() throws Exception {
        int count = 0;
        System.out.println("\n");
        try(FileInputStream inputStream = new FileInputStream("src\\data\\Exercise17_08.dat")) {
            count = inputStream.read();
        } catch(EOFException ex) {
            System.out.println(ex);
        } catch(FileNotFoundException ex) {
            System.out.println("COUNT INITIALIZED");
        }
        try (FileOutputStream outputStream = new FileOutputStream("src\\data\\Exercise17_08.dat")) {
            System.out.println(count);
            outputStream.write(++count);
        }
    }
}
