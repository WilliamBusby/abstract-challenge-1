package com.nology;

public class Square extends Shape {

    private final int sideLength;

    public Square(int sideLength) {
        super(4);
        this.sideLength=sideLength;
    }

    @Override
    public double getArea() {
        return sideLength*sideLength;
    }

    @Override
    public double getPerimeter() {
        return 4*sideLength;
    }
}
