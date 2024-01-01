package com.beanslifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {



       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Shape C = context.getBean("circle", Circle.class);
        C.drawShape2d();

        System.out.println("----------------prototype-------------------");

        Shape S = context.getBean("square", Square.class);
        S.drawShape3d();




        context.close();


    }
}
