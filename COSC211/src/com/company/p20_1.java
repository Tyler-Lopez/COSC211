package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class p20_1 {
    public static void doProblem() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Rebecca");
        stringArrayList.add("Tyler");
        stringArrayList.add("Tiger");
        stringArrayList.add("Jose");
        stringArrayList.add("Al");
        stringArrayList.add("Kachow");
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        for (String s : stringArrayList) priorityQueue.offer(s);
        stringArrayList.forEach(e -> System.out.println(e));
        System.out.println("--------------------------");
        while (priorityQueue.iterator().hasNext()) {
            System.out.println((priorityQueue.poll()));
        }
        System.out.println("--------------------------");
        for (String s : stringArrayList) priorityQueue.offer(s);
        stringArrayList.forEach(e -> System.out.println(e));
    }
}
