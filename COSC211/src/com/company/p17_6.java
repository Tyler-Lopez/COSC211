package com.company;

/*
(Store Loan Objects)
The Loan class in Listing 10.2 does not implement Serializable. Rewrite the Loan class to implement Serializable.
Write a program that creates five Loan objects and stores them in a file named Exercise17_06.dat.
 */

import java.io.*;
import java.util.Date;

public class p17_6 {
    public static void doProblem() throws Exception {
        Loan loan_1 = new Loan(5, 20, 10);
        Loan loan_2 = new Loan(10, 30, 40);
        Loan loan_3 = new Loan(130, 2, 50);
        Loan loan_4 = new Loan(120, 30, 40);
        Loan loan_5 = new Loan(105, 2, 50);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src\\data\\Exercise17_06.dat"))) {
            outputStream.writeObject(loan_1);
            outputStream.writeObject(loan_2);
            outputStream.writeObject(loan_3);
            outputStream.writeObject(loan_4);
            outputStream.writeObject(loan_5);
        }
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src\\data\\Exercise17_06.dat"))) {
            Loan loan_6 = (Loan) inputStream.readObject();
            Loan loan_7 = (Loan) inputStream.readObject();
            Loan loan_8 = (Loan) inputStream.readObject();
            Loan loan_9 = (Loan) inputStream.readObject();
            Loan loan_10 = (Loan) inputStream.readObject();

            System.out.println(loan_6.annualInterestRate);
            System.out.println(loan_7.annualInterestRate);
            System.out.println(loan_8.annualInterestRate);
            System.out.println(loan_9.annualInterestRate);
            System.out.println(loan_10.annualInterestRate);
        }

    }
    public static class Loan implements Serializable {
        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private Date loanDate;

        private transient NotSerializableTest a = new NotSerializableTest(); // If not transient the program will fail to compile.

        public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new Date();
        }

        public double getLoanAmount() {
            return loanAmount;
        }
    }
    public static class NotSerializableTest {

    }
}
