package com.company;

public class p18_9 {
    public static void doProblem() {
        reverseString("Hello there sir");
        System.out.println();
        printIntegerWithoutString(-521313);
    }
    public static void reverseString(String string) {
        if(string.length() > 0) {
            reverseString(string.substring(1));
            System.out.print(string.charAt(0));
        }
        else return;
    }
    public static void printIntegerWithoutString(int number) {
        // If the number is negative print a negative. If the number is 0 just return 0.
        if(number < 0) { System.out.println('-'); }
        else if(number == 0) { System.out.println(0); return; }
        // This boolean used so that leading zeroes are not printed.
        boolean numberStarted = false;
        // 10 is the maximum size an integer may hold.
        for(int i = 10; i >= 0; i--) {
            // Attempt to divide each number by some power of 10 to retrieve digit.
            // Example: when 2167 is divided by 1000 it results in 2.
            int firstDigit = number / (int)Math.pow(10, i);
            if(firstDigit != 0 && !numberStarted) numberStarted = true;
            if(numberStarted) {
                System.out.println(Math.abs(firstDigit));
                // Remove leading digit from number.
                number = number % (int) Math.pow(10, i);
            }
        }
    }
}
