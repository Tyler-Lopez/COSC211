package com.company;

public class p18_10 {
    public static void doProblem() {
        System.out.println(count("Bunsen Burner Youtube Channel", 'e'));
    }
    public static int count(String s, char c) {
        int count = s == null || s.length() == 0 ? 0 : (s.charAt(0) == c) ? 1 : 0;
        if(s != null && s.length() > 1) return count + count(s.substring(1), c);
        return count;
    }
}
