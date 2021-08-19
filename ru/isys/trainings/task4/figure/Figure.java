package ru.isys.trainings.task4.figure;

public interface Figure{
    default double GetArea() {
        return 0;
    }

    default double GetPerimeter() {
        return 0;
    }

    public String toString();
}

