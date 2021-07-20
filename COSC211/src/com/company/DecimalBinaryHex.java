package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class DecimalBinaryHex {
    public static void doProblem() {
            String eightBit = "01111010";
            ArrayList<int[]> fourBitArray = parseBitToFour(eightBit);

            for (int[] arr : fourBitArray) {
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (i == 0) sum += (arr[i] * 8);
                    if (i == 1) sum += (arr[i] * 4);
                    if (i == 2) sum += (arr[i] * 2);
                    if (i == 3) sum += (arr[i]);
                }
                System.out.println("\n" + sum);
                System.out.print("\n");
            }

        }

    public static ArrayList<int[]> parseBitToFour(String bit) {
        ArrayList<int[]> toReturn = new ArrayList<>();
        for(int i = bit.length() - 1; i >= 0; i-=4) {
            int[] fourBit = new int[4];
            try{ fourBit[0] = Integer.valueOf(String.valueOf(bit.charAt(i-3))); } catch(IndexOutOfBoundsException ex) { fourBit[0] = 0; }
            try{ fourBit[1] = Integer.valueOf(String.valueOf(bit.charAt(i-2))); } catch(IndexOutOfBoundsException ex) { fourBit[1] = 0; }
            try{ fourBit[2] = Integer.valueOf(String.valueOf(bit.charAt(i-1))); } catch(IndexOutOfBoundsException ex) { fourBit[2] = 0; }
            fourBit[3] = Integer.valueOf(String.valueOf(bit.charAt(i)));
            toReturn.add(fourBit);
        }
        return toReturn;
    }

}

