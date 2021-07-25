package com.company;

public class p18_13 {
    public static void doProblem() {
        int[] arr = { 5, 4, 2, 1, 1, 1, 1, 69, 20 };
        findLargestArray(arr);
    }
    public static void findLargestArray(int[] arr) {
        findLargestArray(arr, arr[0], 1);
    }
    public static void findLargestArray(int[] arr, int highest, int currentIndex) {
        if(arr[currentIndex] > highest) highest = arr[currentIndex];
        if(arr.length - 1 == currentIndex) System.out.println(highest);
        else findLargestArray(arr,highest,currentIndex+1);
    }
}
