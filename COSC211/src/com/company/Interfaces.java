package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Interfaces {
    public static void doProblem() {
        GeometricObject[] objects = new GeometricObject[10];
        Number[] numbers = new Number[5];
        numbers[0] = Integer.valueOf(5000);
        Calendar calendar = new GregorianCalendar(1994, 5, 9);
        System.out.println(calendar);
        System.out.println("Current time is " + new Date());
        Animal animal = new Chicken();
        System.out.println(((Chicken) animal).howToEat());
    }
    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
         return (object1.getArea() == object2.getArea());
    }

    public static abstract class Animal {
        private double weight;
        public double getWeight() {
            return weight;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }
        public abstract String sound();
    }
    public interface Edible {
        public abstract String howToEat();
    }
    abstract static class Fruit implements Edible {

    }
    interface A {
        void m1();
    }
    class B implements A {
        @Override
        public void m1() {
            System.out.println("TEST");
        }
    }
    public static class Chicken extends Animal implements Edible, Comparable {
        @Override
        public String sound() {
            return null;
        }
        @Override
        public String howToEat() {
            return "Fry it.";
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
    class Tiger extends Animal {
        @Override
        public String sound() {
            return "Roar";
        }
    }



    public class Triangle extends GeometricObject {
        @Override
        public double getArea() {
            return 0;
        }
        @Override
        public double getPerimeter() {
            return 0;
        }
    }
    public abstract class GeometricObject2 extends GeometricObject {
        // Does not need to implement methods of GeometricObject as it is, itself, abstract.
    }
    // The subclass, GeometricObject, is abstract while the superclass Object is concrete.
    public abstract class GeometricObject {
        private String color = "white";
        private boolean filled;
        private Date dateCreated;
        // The constructor is defined as protected because it is used ONLY by the subclasses.
        protected GeometricObject() {
            dateCreated = new Date();
        }
        protected GeometricObject(String color, boolean filled) {
            dateCreated = new Date();
            this.color = color;
            this.filled = filled;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public boolean isFilled() {
            return filled;
        }
        public void setFilled(boolean filled) {
            this.filled = filled;
        }
        public Date getDateCreated() {
            return dateCreated;
        }
        @Override
        public String toString() {
            return "Created on: " + dateCreated + "\nColor: " + color + "\nFilled: " + filled;
        }
        public abstract double getArea();
        public abstract double getPerimeter();
    }
}
