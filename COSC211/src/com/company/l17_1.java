package com.company;

import javax.xml.crypto.Data;
import java.io.*;

public class l17_1 {
    public l17_1() throws FileNotFoundException {
    }

    public static void doListing() throws IOException {

        try (FileOutputStream output = new FileOutputStream("src\\data\\17_1.dat")) {
            for (int i = 200; i <= 500; i++) {
                output.write(i);
            }
        }
        try (FileInputStream input = new FileInputStream("src\\data\\17_1.dat")) {
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + "\n");
            }
        }
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src\\data\\17_1.dat"))) {
            while (true) {
                System.out.println(dataInputStream.readInt());
            }
        } catch (EOFException ex) {
            System.out.println("No issue here. Just end of data");
        }

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src\\data\\17_1_2.dat"))) {
            for(int i = 1; i < 1001; i++) {
                dataOutputStream.writeInt(i);
            }
        }
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src\\data\\17_1_2.dat"))) {
            while(true) {
                System.out.println(dataInputStream.readInt());
            }
        } catch(EOFException ex) {
            System.out.println("End of file reached.");
        }
    }
}

