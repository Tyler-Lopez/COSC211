package com.company;

/*
(BitOutputStream)
Implement a class named BitOutputStream, as shown in Figure 17.22, for writing bits to an output stream.
The writeBit(char bit) method stores the bit in a byte variable. When you create a BitOutputStream, the byte is empty.
After invoking writeBit('1'), the byte becomes 00000001. After invoking writeBit("0101"), the byte becomes 00010101. The first three bits are not filled yet.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

public class p17_18 {
    public static void doProblem() throws Exception {
        System.out.println("Here start");
        try (RandomAccessFile raf = new RandomAccessFile("src\\data\\Exercise17_18_01.dat", "rw")) {
            raf.setLength(0);
            raf.writeInt(555);

            raf.seek(0);
            int value;
            while((value = raf.read()) != -1) {
                System.out.print(getBits(value));
            }
        }
    }

    public static String getBits(int value) {
        String result = "";
        int mask = 1;
        for(int i = 7; i >= 0; i--) {
            System.out.println(result + "Result");
            System.out.println(value);
            int temp = value >> i; // Shift
            int bit = temp & mask;
            result = result + bit;
        }
        return result;
    }
}
