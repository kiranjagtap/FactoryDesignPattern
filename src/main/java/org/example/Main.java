package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args ) {
      /*  Circle c = new Circle(5);
        c.draw();
        Triangle triangle = new Triangle(2,4,6);
        triangle.draw();*/

        /*Shape circle = new Circle(5);
        circle.draw();

        Shape triangle = new Triangle(2,4,6);
        triangle.draw();

        Shape rectangle = new Rectangle(5,10);
        rectangle.draw();*/

        /*FactoryClass factory = new FactoryClass();
        Shape circle = factory.getShape("CIRCLE");
        ((Circle) circle).setRadius(5);
        circle.draw();


        FactoryClass factory2 = new FactoryClass();
        Shape triangle = factory.getShape("TRIANGLE");
        ((Triangle) triangle).setSide1(5);
        ((Triangle) triangle).setSide2(5);
        ((Triangle) triangle).setSide3(5);
        triangle.draw();*/

        //ApplicationContext context = new ClassPathXmlApplicationContext("springiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");
       /* Circle c = context.getBean(Circle.class);
        System.out.println(c.hashCode());
        c.draw();
        Triangle t = context.getBean(Triangle.class);
        t.draw();
        Circle c2 = context.getBean(Circle.class);
        System.out.println(c2.hashCode());
        c2.draw();*/



        DrawShape shape = context.getBean(DrawShape.class);
        shape.draw();

    }
}
