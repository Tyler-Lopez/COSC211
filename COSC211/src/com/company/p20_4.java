package com.company;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Comparator;

public class p20_4 {
    public static void doProblem() {
        Point2D[] points = new Point2D[100];
        for(int i = 0; i < points.length; i++) {
            points[i] = new Point2D.Double(Math.random(),Math.random());
        }
        for(Point2D p2d : points) System.out.println(p2d.getY());
        System.out.println("-------------------");

        Arrays.sort(points,new CompareY());


        System.out.println("-------------------");
        for(Point2D p2d : points) System.out.println(p2d.getY());

    }

    public static class CompareY implements Comparator<Point2D> {

        @Override
        public int compare(Point2D o1, Point2D o2) {

            if (o1.getY() > o2.getY() )
                return 1;
            else if (o1.getY() < o2.getY() )
                return -1;
            else if (o1.getY()  > o2.getY() )
                return 1;
            else if (o1.getY()  < o2.getY() )
                return -1;
            else
                return 0;
        }
    }
}
