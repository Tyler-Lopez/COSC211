package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class p20_6 {
    public static void doProblem() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 5000000; i++) {
            linkedList.add((int)(Math.random() * 99) + 1);
        }
        long beforeTime = System.currentTimeMillis();
        Iterator<Integer> iterator = linkedList.iterator();
        while(iterator.hasNext()) iterator.next();
        long afterTime = System.currentTimeMillis();
        System.out.println(afterTime - beforeTime);
        beforeTime = System.currentTimeMillis();
        for(int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        afterTime = System.currentTimeMillis();
        System.out.println(afterTime - beforeTime);

    }
}
