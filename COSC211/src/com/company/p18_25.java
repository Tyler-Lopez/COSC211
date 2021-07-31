package com.company;

public class p18_25 {
    public static void doProblem() {
  //      displayPermutation("ab");
      //  System.out.println(fib(10));
        printIntegerWithoutString(Integer.MAX_VALUE);
    }
    public static void displayPermutation(String s) {
        // Start.
        displayPermutation("",s);

    }
    public static void displayPermutation(String s1, String s2) {
        System.out.println("displayPermutation: " + s1 + " | " + s2);
        // Initialize a variable called s2Length which is the length of S2
        int s2Length = s2.length();
        // If the size of s2 is now empty, print the contents of s1 - which is a valid permutation.
        if(s2Length == 0) System.out.println(s1);
        // Otherwise...
        else {
            // For each character in S2...
            for(int i = 0; i < s2Length; i ++) {
                System.out.println("HERE: " + s2 + " | THERE: " + s1 +" | s2Length: " + s2Length);
                // For each character in S2 (which is constantly shrinking), do this again.  
                displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
            }
        }
    }

    public static void printIntegerWithoutString(int number) {
        // If the number is negative print a negative. If the number is 0 just return 0.
        if(number < 0) { System.out.println('-'); }
        else if(number == 0) { System.out.println(0); return; }
        // This boolean used so that leading zeroes are not printed.
        boolean numberStarted = false;
        // 10 is the maximum size an integer may hold.
        for(int i = 9; i >= 0; i--) {
            // Attempt to divide each number by some power of 10 to retrieve digit.
            // Example: when 2167 is divided by 1000 it results in 2.
            //System.out.println(number);
          //  System.out.println("HERE " + (int)Math.pow(10, i));
            int firstDigit = number / (int)Math.pow(10, i);
            if(firstDigit != 0 && !numberStarted) numberStarted = true;
            if(numberStarted) {
                System.out.println(Math.abs(firstDigit));
                // Remove leading digit from number.
                number = number % (int) Math.pow(10, i);
            }
        }
    }
    public static int fib(int index) {
        return index == 0 ? 0 : index == 1 ? 1 :  fib(index-1) + fib(index-2);
    }
}
