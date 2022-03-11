package com.nology;

public class Triangle extends Shape {

    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        super(3);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public double getArea() {
        double semi = (side1+side2+side3)/2;
        return Math.sqrt(semi*(semi-side1)*(semi-side2)*(semi-side3));
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }


}
