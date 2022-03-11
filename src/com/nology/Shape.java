package com.nology;

public abstract class Shape {

    private final int numOfSides;

    public Shape(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public int getNumOfSides() {
        return numOfSides;
    }
}
