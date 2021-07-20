package com.company;

import java.io.*;
import java.util.Scanner;

public class p17_19 {
    Scanner input = new Scanner(System.in);
    public static void doProblem() throws IOException {
        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src\\data\\Exercise17_19.dat"))) {
            for(int i = 0; i < 1000; i++) {
                bufferedOutputStream.write(i);
            }
        }
        int count = 0;
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src\\data\\Exercise17_19.dat"))) {
            int value;
            while((value = bufferedInputStream.read()) != -1) count++;
        }
        try(FileOutputStream fileOutputStream = new FileOutputStream("src\\data\\Exercise17_19.dat")) {
            for(int i = 0; i < 1000; i++) fileOutputStream.write(i);
        }
        try(FileInputStream fileInputStream = new FileInputStream("src\\data\\Exercise17_19.dat")) {
            int value;
            count = 0;
            while((value = fileInputStream.read()) != -1) count++;
        }
    //    System.out.println(count);
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("src\\data\\Exercise17_19.dat", "rw")) {
            for(int i = 0; i < 1000; i++) randomAccessFile.writeInt(i);
        }
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("src\\data\\Exercise17_19.dat", "rw")) {
            count = 0;
            try {
                while(true) {
                    byte readByte = randomAccessFile.readByte();
                    // This is not obvious bro.
                    String eightBit = String.format("%8s", Integer.toBinaryString(readByte & 0xFF)).replace(' ','0');
                    int decimal = Integer.parseInt(eightBit, 2);
                    String hexa = Integer.toString(decimal, 16);
                    System.out.println(eightBit);
                    System.out.println("0x" + hexa);

                    count++;
                }
            } catch(EOFException ex) {
                System.out.println(count);
                System.out.println(randomAccessFile.length());
            }
        }
    }
}
