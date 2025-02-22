package com.learning.dp.creational;

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactoryImpl();
        factory.getShape("Circle").draw();
        factory.getShape("Rectangle").draw();
    }
}


// it provides a factory to create objects rather than creating objects directly

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

interface ShapeFactory {
    Shape getShape(String shape);
}


class ShapeFactoryImpl implements ShapeFactory{
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
