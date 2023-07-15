package org.example;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{

    int side1;
    int side2;
    int side3;

    public Triangle() {
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle with sides "
                +"side1 = "+this.getSide1()
                +" side2 = "+this.getSide2()
                +" side3 = "+this.getSide3());
    }
}
