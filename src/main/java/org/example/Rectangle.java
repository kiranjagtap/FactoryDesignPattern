package org.example;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape{
    int length;
    int breadth;

    public Rectangle() {
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with length ="+this.getLength()
        + " Breadth = "+this.getBreadth());
    }
}
