package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksPractice {
    public static void doProblem() {
        stackPractice();
        System.out.println("--------------------");
        queuePractice();
        System.out.println("--------------------");
        hashMapPractice();
    }
    public static void stackPractice() {
        Stack<String> games = new Stack<>();
        games.add("Call of Duty: Ghosts");
        games.add("Guitar Hero");
        games.add("Super Monkey Ball");
      //  for(String s : games) System.out.println(s);
        games.pop();
     //   System.out.println(games.peek());
        games.set(1,"Rock Band");
        for(String s : games) System.out.println(s);
        System.out.println(games.peek());
        games.pop();
        System.out.println(games);


    }
    public static void queuePractice() {
        Queue<String> bbqLine = new LinkedList<>();
        bbqLine.add("Rebecca");
        bbqLine.add("Tyler");
        bbqLine.add("Jose");
        System.out.println(bbqLine);
        bbqLine.poll();
        System.out.println(bbqLine);
        bbqLine.poll();
        System.out.println(bbqLine);
        bbqLine.add("Rebecca");
        bbqLine.add("Tyler");
        System.out.println(bbqLine);
        System.out.println(bbqLine.peek());
    }
    public static void hashMapPractice() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("1", 1);
        hashMap.put("2", 2);
        hashMap.put("3", 3);
        hashMap.put("4", 4);
        System.out.println(hashMap.get("3"));
    }
}
