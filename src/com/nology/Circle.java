package com.nology;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        super(1);
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI*radius*radius*100)/100;
    }

    @Override
    public double getPerimeter() {
        return Math.round(2*Math.PI*radius);
    }
}
