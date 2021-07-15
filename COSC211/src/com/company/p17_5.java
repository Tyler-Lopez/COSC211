package com.company;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.Date;

/*
(Store objects and arrays in a file)
Write a program that stores an array of the five int values 1,2,3,4 and 5, a Date object for the current time and the double value 5.5 into the file named Exercise17_05.dat.
In the same program, write the code to read and display the data.
 */

public class p17_5 {
    public static void doProblem() throws Exception {
        // try-with-resources
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\data\\Exercise17_05.dat"))) {
            int[] numbers = {1, 2, 3, 4, 5};
            output.writeObject(numbers);
            output.writeDouble(5.5);
            output.writeObject(new Date());
        }

        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("src\\data\\Exercise17_05.dat"))) {
            int[] numbersInput = (int[]) input.readObject();
            double doubleInput = input.readDouble();
            Date dateInput = (Date) input.readObject();

            System.out.print("\n");

            for(int i = 0; i < 5; i++) System.out.print(numbersInput[i]);
            System.out.println("\n" + doubleInput);
            System.out.println(dateInput);
        }


    }
}
