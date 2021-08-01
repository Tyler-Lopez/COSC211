package com.company;

import java.util.PriorityQueue;

public class p20_10 {
    public static void doProblem() {
        // Priority queue using Comparable:
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.offer("George");
        priorityQueue1.offer("Jim");
        priorityQueue1.offer("John");
        priorityQueue1.offer("Blake");
        priorityQueue1.offer("Kevin");
        priorityQueue1.offer("Michael");

        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.offer("George");
        priorityQueue2.offer("Katie");
        priorityQueue2.offer("Kevin");
        priorityQueue2.offer("Michelle");
        priorityQueue2.offer("Ryan");

        System.out.println("\npriorityQueue1: ");
        priorityQueue1.forEach(e -> System.out.print(e + " "));
        System.out.println("\npriorityQueue2: ");
        priorityQueue2.forEach(e -> System.out.print(e + " "));
        PriorityQueue<String> difference = difference(priorityQueue1, priorityQueue2);
        System.out.println("\nDifference: ");
        difference.forEach(e -> System.out.print(e + " "));
        PriorityQueue<String> union = union(priorityQueue1, priorityQueue2);
        System.out.println("\nUnion: ");
        union.forEach(e -> System.out.print(e + " "));
        PriorityQueue<String> intersection = intersection(priorityQueue1, priorityQueue2);
        System.out.println("\nIntersection: ");
        intersection.forEach(e -> System.out.print(e + " "));
    }
    public static <T> PriorityQueue<T> difference(PriorityQueue<T> set1, PriorityQueue<T> set2) {
        PriorityQueue<T> difference = new PriorityQueue<>(set1);
        difference.removeAll(set2);
        return difference;
    }
    public static <T> PriorityQueue<T> union(PriorityQueue<T> set1, PriorityQueue<T> set2) {
        PriorityQueue<T> union = new PriorityQueue<>(set1);
        union.addAll(set2);
        return union;
    }
    public static <T> PriorityQueue<T> intersection(PriorityQueue<T> set1, PriorityQueue<T> set2) {
        PriorityQueue<T> intersection = new PriorityQueue<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}
