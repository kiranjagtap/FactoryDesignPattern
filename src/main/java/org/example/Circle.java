package org.example;

import org.springframework.stereotype.Component;

@Component
public class Circle implements  Shape{
    int radius;


    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with Radius ="+this.getRadius());

    }
}
