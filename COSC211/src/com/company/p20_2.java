package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class p20_2 {
    public static void doProblem() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(44);
        linkedList.add(35);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.forEach(e -> System.out.println(e));
        printLine();
        Collections.shuffle(linkedList);
        printLine();
        linkedList.forEach(e -> System.out.println(e));
        printLine();
        Collections.sort(linkedList);
        linkedList.forEach(e -> System.out.println(e));
        printLine();
        Collections.reverse(linkedList);
        linkedList.forEach(e -> System.out.println(e));



    }
    public static void printLine() {
        System.out.println("------------------------");
    }
}
