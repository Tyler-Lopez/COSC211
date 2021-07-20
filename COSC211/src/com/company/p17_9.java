package com.company;

/*
(Address book)
Write a program that stores, retrieves, adds, and updates addresses as shown in Figure 17.20.
Use a fixed-length string for storing each attribute in the address.
Use random-access file for reading and writing an address. Assume the sizes of the name, street, state, and zip are 32, 32, 20, 2, and 5 bytes, respectively.
 */

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class p17_9 {
    static Scanner input = new Scanner(System.in);

    public static void doProblem() throws Exception {
        int choice = 0;
        while (true) {
            System.out.println("\nChoose an option");
            System.out.println("----------------");
            System.out.println("1. Add an Address");
            System.out.println("2. Browse Address");
            try {
                choice = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Try again.");
            }
            input.nextLine();
            if(choice == 1) addAddress();
            else readAddress();


        }
    }

    public static void addAddress() throws IOException {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("src\\data\\Exercise17_09.dat", "rw")) {
            long initialPosition = randomAccessFile.length();
            randomAccessFile.seek(initialPosition);
            System.out.println("Initial Position: " + initialPosition);
            System.out.println("Name?");
            randomAccessFile.writeBytes(input.nextLine()+"\n");
            randomAccessFile.seek(initialPosition + 32);
            System.out.println("Street?");
            randomAccessFile.writeBytes(input.nextLine()+"\n");
            randomAccessFile.seek(initialPosition + 64);
            System.out.println("City?");
            randomAccessFile.writeBytes(input.nextLine()+"\n");
            randomAccessFile.seek(initialPosition + 64 + 20);
            System.out.println("State?");
            randomAccessFile.writeBytes(input.nextLine()+"\n");
            randomAccessFile.seek(initialPosition + 64 + 20 + 2);
            System.out.println("Zip?");
            randomAccessFile.writeBytes(input.nextLine()+"\n");
            randomAccessFile.setLength(initialPosition + 64 + 20 + 2 + 5);
        }
    }

    public static void readAddress() throws IOException {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("src\\data\\Exercise17_09.dat", "rw")) {
            long repeatCount = (randomAccessFile.length() / (32+32+20+5+2));
            int eachLength = (32+32+20+5+2);
            for(int i = 0; i < repeatCount; i++) {
                randomAccessFile.seek(eachLength * i);
                System.out.println(randomAccessFile.readLine());
                randomAccessFile.seek(eachLength * i + 32);
                System.out.println(randomAccessFile.readLine());
                randomAccessFile.seek(eachLength * i + 32 + 32);
                System.out.println(randomAccessFile.readLine());
                randomAccessFile.seek(eachLength * i + 20 + 32 + 32);
                System.out.println(randomAccessFile.readLine().substring(0,2));
                randomAccessFile.seek(eachLength * i + 20 + 32 + 32 + 2);
                System.out.println(randomAccessFile.readLine().substring(0,5) + "\n\n");
            }
        }
    }

    public static class Address {
        String name;
        String street;
        String city;
        String state;
        String zip;

        public Address(String name, String street, String city, String state, String zip) {
            this.name = name;
            this.street = street;
            this.city = city;
            this.state = state;
            this.zip = zip;
        }
    }

}
