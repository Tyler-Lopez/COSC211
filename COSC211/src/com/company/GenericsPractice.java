package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenericsPractice {
    public static void doProblem() {
        List<String> strings = new ArrayList();
        strings.add("Hello");
        strings.add("World");
        // Introduces bugs, as it will allow you to add a number to this list of Strings.

        // You need to cast the object as a String to work with it if you want to assign it to a String.
        String hello = (String) strings.get(0);
       // MyClass<Integer> obj = new MyClass<>();
        //MyClass<Integer> obj2 = new MyClass<>();
      //  MyClass<Double> obj3 = new MyClass<>();
       // obj.showType();
     //   obj3.showType();
        Pair<Integer,String> funnyNumbers = new Pair<>(420,"69");
        System.out.println(funnyNumbers.getFirst());
        System.out.println(funnyNumbers.getSecond());
        Pair<Integer, String> stringStringPair = new Pair<>(21, "String2");
        System.out.println(stringStringPair.getFirst());
        System.out.println(stringStringPair.getSecond());
        Character[] charArr = { 'H', 'E', 'L', 'L', 'O', ' ', 'W' };
        displayArray(charArr);

    }
    public static <T> void displayArray(T[] arr) {
        for(T x : arr) System.out.println(x + " ");
    }
    public static class MyClass<T,S> {
        T obj;
        MyClass(T obj) {
            this.obj = obj;
        }
        // Function that prints out the type of our variable.
        void showType() {
            System.out.println(obj.getClass().getName());
        }
    }
    // Here, this makes sure the first type extends Number
    // Always use the word extends even if using an interface.

    public static class Pair<T extends Number, S extends Comparable<S>> {
        private final T first;
        private final S second;
        public Pair(T first, S second) {
            this.first = first;
            this.second = second;
        }
        public T getFirst() {
            return this.first;
        }
        public S getSecond() {
            return this.second;
        }
    }

}
