package com.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {



        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Shape C = context.getBean("circle", Circle.class);
        C.drawShape2d();

        System.out.println("----------------prototype-------------------");

        Shape S = context.getBean("square", Square.class);
        S.drawShape3d();




    }
}
