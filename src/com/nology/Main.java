package com.nology;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Abstract Classes - Challenge
        //
        //Your challenge is to create an Abstract Class called "Shape".
        //
        //Shape must have two abstract methods called getArea and getPerimeter.
        //
        //Shape must have the data attribute numOfSides.
        //
        //You must create four subclasses called Square, Rectangle, Triangle and Circle that extend the abstract class Shape.
        //
        //These subclasses will have different amounts of variables associated to them.
        //
        //Complete the logic so that all four shapes can be instantiated and both methods called on them.  These methods should simply return the value of perimeter and area.
        //
        //Bonus - Create an array of 50 Shapes.  Random amount of triangles, circles and squares.  All of these shapes should have correct but random arguments passed into them.

        Triangle newTri = new Triangle(2,2,2);
        System.out.println(newTri.getPerimeter());
        System.out.println(newTri.getArea());
    }

    public List<Shape> random50Shapes() {
        List<Shape> outputList = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i<50; i++) {

        }

        return outputList;
    }

    public Shape generateShape(int type, int value1, int value2, int value3) {
        return new Circle(1);
    }
}
