package ru.isys.trainings.task4.rectangle;

import ru.isys.trainings.task4.figure.Figure;
import ru.isys.trainings.task4.figure.triangle.Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Rectangle
implements Figure, Comparable <Rectangle> {
    private int l1;
    private int l2;
    private double area;

    public void SetLength1(int l1){
        this.l1 = l1;
    }
    public void SetLength2(int l2){
        this.l2 = l2;
    }
    public int GetLength1(){

        int l11 = this.l1;
        return l11;
    }

    public int GetLength2(){

        int l21 = this.l2;
        return l21;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double GetArea() {
        return this.l1 * this.l2;
    }
    @Override
    public double GetPerimeter() {
        return (this.l1 + this.l2) * 2;
    }

    @Override
    public String toString()
        {
            return " Area =" + this.GetArea() +
                   " Perimeter=" + this.GetPerimeter();
        }

    public Rectangle(int l1, int l2){
        SetLength1(l1);
        SetLength2(l2);
        setArea(this.GetPerimeter());
    }

    @Override
    public int compareTo(Rectangle o) {
        int result = Double.compare(area, o.area);
        return result;
    }





}


