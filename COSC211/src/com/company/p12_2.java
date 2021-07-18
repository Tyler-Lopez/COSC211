package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p12_2 {

    static Scanner input = new Scanner(System.in);
    static int numberOfIntegers = 2;

    public static void doProblem() {
        System.out.println("Enter two integers and their sum will be displayed: ");
        int[] numbersEntered = new int[numberOfIntegers];
        for(int i = 0; i < numberOfIntegers; i++) {
            boolean catchError = true;
            while (catchError) {
                try {
                    numbersEntered[i] = input.nextInt();
                    catchError = false;
                } catch (InputMismatchException ex) {
                    input.nextLine();
                    System.out.println("Invalid input entered. Please try again.");
                }


            }
        }
        int sum = 0;
        for(int i : numbersEntered) { sum+=i; }
        System.out.println("The total sum is: " + sum);



    }
}
