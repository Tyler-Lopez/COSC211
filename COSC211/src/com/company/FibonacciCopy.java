package com.company;

import java.io.*;
import java.util.RandomAccess;

public class FibonacciCopy  {

    public static void doProblem() throws IOException {
        long currentTime = System.currentTimeMillis();
        System.out.println(returnFibonacci(50));
    //    System.out.println("ALL FIBONACCI NUMBERS CALCULATED: ");
     //   printAllFibonacci();
        long timeAfterRunning = System.currentTimeMillis();
        System.out.println("Execution time: " + (timeAfterRunning-currentTime));
        currentTime = System.currentTimeMillis();
        System.out.println(fib(50));
        timeAfterRunning = System.currentTimeMillis();
        System.out.println("Execution time: " + (timeAfterRunning-currentTime));
    }
    public static long fib(int number) {
        return number == 0 ? 0 : number == 1 ? 1 : fib(number-1) + fib(number - 2);
    }
    public static long returnFibonacci(int fibonacciNumber) throws IOException {
        long seriesValue;
        // Try-with-resources opening of a random access file.
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("src\\data\\fibonacci.dat", "rw")) {
              randomAccessFile.seek(8 * fibonacciNumber);
              try {
                  seriesValue = randomAccessFile.readLong();
              } catch(EOFException ex) {
                  randomAccessFile.writeLong(calculateFibonacci(fibonacciNumber));
                  return returnFibonacci(fibonacciNumber);
              }
        }
        return seriesValue;
    }
    public static void printAllFibonacci() throws IOException {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("src\\data\\fibonacci.dat", "r")) {
            randomAccessFile.seek(0);
            for(int i = 0; i < 90; i++) printAllFibonacci(randomAccessFile, i);
        }
    }
    public static void printAllFibonacci(RandomAccessFile randomAccessFile, int i) throws IOException {
        try {
            randomAccessFile.seek(8 * i);
            System.out.println("SERIES " + i + ": " + randomAccessFile.readLong());

        } catch(EOFException ex) {
            System.out.println("SERIES " + i + ": NOT YET CALCULATED.");
        }
    }
    private static long calculateFibonacci(int number) throws IOException {
        if(number == 0) return 0;

        long calculation = 0;
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("src\\data\\fibonacci.dat", "rw")) {
            randomAccessFile.seek(8 * number);
            try {
                if(number == 1) {
                    randomAccessFile.writeLong(1);
                    return 1;
                }
                calculation = randomAccessFile.readLong();
                return calculation;
            } catch(EOFException ex) {
                System.out.println(number+" was calculated, not found.");
                calculation = calculateFibonacci(number - 1) + calculateFibonacci(number - 2);
                randomAccessFile.writeLong(calculation);
                return calculation;
            }
        }
    }
}
