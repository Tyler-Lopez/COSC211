package com.company;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.Scanner;

public class FileStream {
    public static void doProblem() throws IOException {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("src\\data\\RandomAccessTest.dat", "rw")) {
            randomAccessFile.setLength(0);
            char c = Character.MAX_VALUE;
            randomAccessFile.writeUTF(""+c);
            System.out.println(randomAccessFile.length());
            randomAccessFile.seek(0);
            System.out.println(randomAccessFile.readUTF());
            randomAccessFile.setLength(0);
            randomAccessFile.writeUTF("aaaa");
            System.out.println(randomAccessFile.length());
            char greaterThanOrEqual = 2265;
            System.out.println(greaterThanOrEqual);
            int value = 2167;
            DataOutputStream output = new DataOutputStream(
                    new FileOutputStream("t.dat"));
            output.writeShort(1234);
            output.writeShort(5678);
            output.close();
            try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("t.dat"))) {
                while(true) {
                    try{
                        System.out.println(dataInputStream.readShort());
                    } catch(EOFException ex) {

                    }
                }
            }

        }
        /*
        try(FileOutputStream output = new FileOutputStream("src\\data\\FileStreamTest.dat")) {
            for(int i = 0; i < 1000; i++) {
                output.write(i);
            }
        }
        try(FileInputStream inputStream = new FileInputStream("src\\data\\FileStreamTest.dat")) {
            int value;
            while((value = inputStream.read()) != -1) {
                System.out.println(value);
            }
        }
        try(FileInputStream inputStream = new FileInputStream("src\\data\\FileStreamTest.dat")) {
            Scanner inputScanner = new Scanner(inputStream);
            while((inputScanner.hasNext())) {
                System.out.println(inputScanner.next() + " SCANNER");
            }
        }
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src\\data\\DataStreamTest.dat"))) {
            for(int i = 0; i < 10000; i++) {
                dataOutputStream.writeInt(((int)(Math.random()*100)+1));
            }
        }
        try(DataInputStream inputStream = new DataInputStream(new FileInputStream("src\\data\\DataStreamTest.dat"))) {
            try {
                while (true) {
                    System.out.println(inputStream.readInt() + " DATA STREAM");
                }
            } catch(EOFException ex) {
                System.out.println("REACHED END OF FILE.");
            }
        }
        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src\\data\\BufferedStreamTest.dat"))) {
            for(int i = 0; i < 10000; i++) bufferedOutputStream.write(i);
        }
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src\\data\\BufferedStreamTest.dat"))) {
            int value;
            try{
                while((value = bufferedInputStream.read()) != -1) {
                    System.out.println(bufferedInputStream.read());
                }
            } catch(EOFException ex) {
                System.out.println("end of file");
            }
        }


        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src\\data\\ObjectStreamTest.dat"))) {
            for(int i = 0; i < 1000; i++) objectOutputStream.writeObject(new String("HELLO"));
        }
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src\\data\\ObjectStreamTest.dat"))) {
            try {
                while(true) {
                    System.out.println(objectInputStream.readObject());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (EOFException e) {
                System.out.println("END OF FILE");
            }
        }
        try(PrintWriter printWriter = new PrintWriter("src\\data\\PrintWriterTest.txt")) {
            printWriter.println("HI");
        }
        try(FileOutputStream fileOutputStream = new FileOutputStream("src\\data\\FileStreamTest.dat")) {
            for(int i = 0; i < 1000; i++) fileOutputStream.write(i);
        }
        try(FileInputStream fileInputStream = new FileInputStream("src\\data\\FileStreamTest.dat")) {
            int value;
            while((value = fileInputStream.read()) != -1) System.out.println(value + "FILESTREAM");
        }
        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src\\data\\BufferedStream.test"))) {
            for(int i = 0; i < 10000; i++) bufferedOutputStream.write(i);
        }
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src\\data\\BufferedStream.test"))) {
            int value;
            while((value = bufferedInputStream.read()) != -1) System.out.println(value);
        }

         */

    }
}
