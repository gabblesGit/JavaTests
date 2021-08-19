package ru.isys.trainings.task4.figure.triangle;

import ru.isys.trainings.task4.figure.Figure;
import ru.isys.trainings.task4.rectangle.Rectangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.Math.sin;


public abstract class Triangle
implements Figure, Comparable <Triangle>  {
    private int l1;
    private int l2;
    private int angle;
    private double area;

    public void setArea(double area) {
        this.area = area;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getL1() {
        return l1;
    }

    public int getL2() {
        return l2;
    }

    public int getAngle() {
        return angle;
    }

    public Triangle(int l1, int l2, int angle) {
        this.l1 = l1;
        this.l2 = l2;
        this.angle = angle;
        this.area = GetArea();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                " l1=" + l1 +
                ", l2=" + l2 +
                ", angle=" + angle +
                ", area = " + this.GetArea() + " }";
    }

    @Override
    public double GetArea() {
        return (this.l1*this.l2*sin(this.angle))/2;
    }

    @Override
    public int compareTo(Triangle o) {
        int result = Double.compare(area, o.area);
        return result;
    }

    public static class tTriangle extends Triangle{
        public tTriangle(int l1, int l2, int angle) {
            super(l1, l2, angle);
        }
    }

    public static class TriCompare implements Comparator<Triangle>{

        @Override
        public int compare(Triangle o1, Triangle o2) {
            int result = Double.compare(o1.area, o2.area);
            return result;
        }
    }

}
