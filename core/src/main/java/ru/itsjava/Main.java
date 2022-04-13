package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Animal piglet = new Piglet();
        ApplicationContext context
                = new ClassPathXmlApplicationContext("context.xml");

//        Animal piglet = context.getBean("pig", Animal.class);
//        piglet.say();

        KingFarmer farmer = context.getBean("farmer", KingFarmer.class);
        farmer.hi();
    }
}
