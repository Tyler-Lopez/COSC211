package com.company;

import java.sql.Array;
import java.util.*;

public class Chapter20Practices {
    public static void doProblem() {
        collections();
        // Each collection is Iterable. You can obtain it's Iterator object to traverse all elements in the collection.
        iterables();
    }
    public static void collections() {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.println("A list of cities in collection1: ");
        System.out.println(collection1);

        System.out.println("Is Dallas in collection1? " + collection1.contains("Dallas"));

        collection1.remove("Dallas");
        System.out.println("\n" + collection1.size() + " cities are in collection 1 now.");

        System.out.println("Is Dallas in collection1? " + collection1.contains("Dallas"));
    }
    public static void iterables() {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        collection1.forEach(e -> System.out.println(e));
        ArrayList<StringBuilder> collection2 = new ArrayList<>();
        collection2.add(new StringBuilder("Hello"));
        collection2.add(new StringBuilder("Hello1"));
        collection2.add(new StringBuilder("Hello2"));
        collection2.add(new StringBuilder("Hello3"));
        collection2.add(new StringBuilder("Hello4"));
        // forEach is a default method of the Iterable interface, which all Collections implement.
        collection2.forEach(e -> System.out.println(e.replace(0,0,"hi")));

        collection2.forEach(e -> System.out.println(e.toString()));
        ListIterator<StringBuilder> listIterator = collection2.listIterator();
        while(listIterator.hasNext()) System.out.println(listIterator.next());
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        test(arrayList);
        test(linkedList);
        // Obtains iterator object for the collection.
    //    while(collection1.iterator().hasNext()) {
    //        System.out.println(collection1.iterator().next());
    //    }
    }
    public static void test(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
