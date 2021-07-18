package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Scanner;

public class p12_17 {
    public static void doProblem() throws IOException, ClassNotFoundException {
        FileReader fileReader = new FileReader("src\\data\\words.txt");
        Scanner input = new Scanner(new File("src\\data\\words.txt"));
        Scanner userInput = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        while(input.hasNext()) {
            words.add(input.nextLine());
        }
        String word = selectRandom(words);
        StringBuilder presentedWord = new StringBuilder();
        int incorrectAttempts = 0;

        for(Character c : word.toCharArray()) presentedWord.append("*");
        while(presentedWord.indexOf("*")!=-1) {
            System.out.print("(Guess) Enter a letter in word " + presentedWord+"\n"+"     ");
            String attemptedEntry = userInput.nextLine();
            if(attemptedEntry.length() != 1) System.out.println("Too long or short!");
            else if(!Character.isLetter(attemptedEntry.charAt(0))) System.out.println("     "+"You must enter a character!");
            else if(presentedWord.indexOf(String.valueOf(attemptedEntry.charAt(0)))!=-1) System.out.println("     "+attemptedEntry+" is already in the word.");
            else if(word.indexOf(attemptedEntry.charAt(0))!=-1) {
                System.out.println("     "+attemptedEntry+" has been found.");
                for(int i = 0; i < presentedWord.length(); i ++) {
                    if(presentedWord.charAt(i)=='*' && word.charAt(i) == attemptedEntry.charAt(0)) presentedWord.replace(i,i+1, String.valueOf(attemptedEntry.charAt(0)));
                }
            } else {

                System.out.println("     "+attemptedEntry+" was not found. Incorrect Attempts: " + ++incorrectAttempts);
            }
        }
        System.out.println("     "+"Word was "+word);

    }

    public static String selectRandom(ArrayList<String> arr) {
        return arr.get((int)(Math.random()*(arr.size()+1)));
    }

    public class NotALetterException extends Exception {
        public NotALetterException(String ex) {

        }
    }


}
