package com.company;

public class p12_5 {
    public static void doProblem() {
        try {
            Triangle t1 = new Triangle(1,1,500);
            System.out.println("HERE");
        } catch(IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }


    }
    public static class Triangle {
        public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
            double[] sides = new double[3];
            sides[0] = side1;
            sides[1] = side2;
            sides[2] = side3;

            int maxIndex = 0;
            double maxValue = sides[0];
            for(int i = 1; i < sides.length; i++) {
                if(sides[i] > maxValue) {
                    maxValue = sides[i];
                    maxIndex = i;
                }
            }
            double sum = 0;
            for(int i = 0; i < sides.length; i++) {
                if(maxIndex != i) {
                    sum += sides[i];
                }
            }
            if(sum <= sides[maxIndex]) throw new IllegalTriangleException("2 SIDES NOT LARGER THAN OTHER");
        }
    }
    public static class IllegalTriangleException extends Exception {
        private String reason;
        public IllegalTriangleException() {

        }
        public IllegalTriangleException(String reason) {
            this.reason = reason;
        }
        public String getMessage() {
            return reason;
        }
    }
}
