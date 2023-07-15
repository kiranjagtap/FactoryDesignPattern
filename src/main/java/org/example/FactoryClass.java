package org.example;

import org.springframework.stereotype.Component;

@Component
public class FactoryClass {

    public Shape getShape(String shape){


        switch (shape){
            case "CIRCLE":
                return new Circle();
            case "TRIANGLE":
                return new Triangle();
            case "RECTANGLE":
                return new Rectangle();





        }
        return null;
    }
}
