package com.company;

import java.io.*;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class p12_11 {
    static String lineToExclude = "the";
    static String lineToInsert = "POOP";
    public static void doProblem() throws IOException {
        try(FileWriter fileWriter = new FileWriter("src\\data\\Exercise12_11_01.txt")) {
            fileWriter.write("Hey diddle, diddle!\nThe cat and the fiddle,\nThe cow jumped over the moon;\nThe little dog laughed\nTo see such sport,\nAnd the dish ran away with the spoon.");
        }
        try(PrintWriter printWriter = new PrintWriter("src\\data\\Exercise12_11_02.txt")) {
           Scanner readFile = new Scanner(new File("src\\data\\Exercise12_11_01.txt"));
           while(readFile.hasNextLine()) {
               System.out.println("here");
               printWriter.write(readFile.nextLine().replaceAll(lineToExclude,lineToInsert).replaceAll("The", lineToInsert)+"\n");

           }
        }

        /*try(RandomAccessFile randomAccessFile = new RandomAccessFile("src\\data\\Exercise12_11_01.txt","rw"))
        {
            String line = randomAccessFile.readLine();
            randomAccessFile.writeBytes(line.replaceAll(lineToExclude,lineToInsert));
        }
                FileInputStream inputStream = new FileInputStream("src\\data\\Exercise17_02.dat");
        int value;
        int sum = 0;
        while((value = inputStream.read()) != -1) { // -1 Signifies the end of a file... but how is -1 stored?*/

    }
}
