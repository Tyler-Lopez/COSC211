package com.company;

/*
(BitOutputStream)
Implement a class named BitOutputStream, as shown in Figure 17.22, for writing bits to an output stream.
The writeBit(char bit) method stores the bit in a byte variable. When you create a BitOutputStream, the byte is empty.
After invoking writeBit('1'), the byte becomes 00000001. After invoking writeBit("0101"), the byte becomes 00010101. The first three bits are not filled yet.
 */

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class p17_17 {
    public static void doProblem() throws Exception {

    }

    public static class BitOutputStream {
        private File file;
        private byte buffer;
        public byte String;

        public BitOutputStream(File file) {
        }
        public void writeBit(char bit) {
        }
        public void writeBit(String bit) {
        }
        public void close() {
        }
    }
}
