package com.company;

import java.sql.Array;
import java.util.*;

public class p20_11 {
    public static void doProblem() {
       // System.out.println(validGrouping("(a{b}}}})"));
        listTest();

    }

    public static boolean validGrouping(String s) {
        // Create a HashMap of valid pairings.
        HashMap<Character, Character> validPairings = new HashMap<>();
        validPairings.put('{', '}');
        validPairings.put('(', ')');
        validPairings.put('[', ']');
        // Initialize a Stack object which will be used to remember the order in which closing characters must be inputted.
        Stack<Character> mustClose = new Stack<>();
        // Iterate through each character of the String.
        for (Character c : s.toCharArray()) {
            // If the character is a opener, add it to the mustClose stack.
            if(validPairings.containsKey(c)) mustClose.push(c);
            else if(validPairings.containsValue(c)) {
                // If a closer is found without a preceding opener, return false.
                // If the closer matches the preceding opener, remove the opener from the stack and proceed.
                if(!mustClose.isEmpty() && validPairings.get(mustClose.peek()) == c) mustClose.pop();
                // Otherwise, return false as grouping symbols cannot overlap.
                else return false;
            }
        }
        // Final check. Are there any hanging open brackets? If so, return false. Otherwise this is valid grouping.
        return mustClose.size() > 0 ? false : true;
    }
    public static void listTest() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test");
        arrayList.add("Test2");
        arrayList.add("Test3");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList.add("Test");
        arrayList.add("Test2");
        arrayList.add("Test3");
        System.out.println("-------------");
        System.out.println(arrayList.equals(arrayList2));

        System.out.println("-------------");
        arrayList.forEach(e -> System.out.println(e));
        System.out.println("-------------");
        arrayList2.forEach(e -> System.out.println(e));
        Collection<String> collection = new ArrayList<>();
        Collections.sort(collection);
    }
    // Unrelated FizzBuzz practice with new data structures.
    public static void fizzBuzz(int number, HashMap<Integer, String> divisibilityPairings) {
        final boolean[] printNumber = {true};
        divisibilityPairings.forEach((integer, s1) -> {
            if(number % integer == 0) {
                printNumber[0] = false;
                System.out.print(s1);
            }
        });
        System.out.println(printNumber[0] ? number : "");
    }
}
