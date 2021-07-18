package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class p12_25 {
    public static void doProblem() throws IOException {
        URL url = new URL("http://liveexample.pearsoncmg.com/data/Salary.txt");
        Scanner input = new Scanner(url.openStream());
        int countAss = 0;
        double sumAss = 0;
        int countFull = 0;
        double sumFull = 0;
        double sumAssoc = 0;
        int countAssoc = 0;
        while (input.hasNextLine()) {
            input.next();
            input.next();
            String category = input.next();
            if(category.equalsIgnoreCase("associate")) {
                countAssoc++;
                sumAssoc += input.nextDouble();
            } else if(category.equalsIgnoreCase("assistant")) {
                countAss++;
                sumAss += input.nextDouble();
            } else {
                countFull++;
                sumFull += input.nextDouble();
            }
        }
        try(PrintWriter printWriter = new PrintWriter("src\\data\\Exercise12_25.txt")) {
            printWriter.println("ASSOCIATES");
            printWriter.println("AVG. SALARY: "+(sumAssoc/countAssoc));
            printWriter.println("TOTAL SALARY: "+(sumAssoc));
            printWriter.println("ASSISTANT");
            printWriter.println("AVG. SALARY: "+(sumAss/countAss));
            printWriter.println("TOTAL SALARY: "+(sumAss));
            printWriter.println("FULL");
            printWriter.println("AVG. SALARY: "+(sumFull/countFull));
            printWriter.println("TOTAL SALARY: "+(sumFull));

        }

    }

}
