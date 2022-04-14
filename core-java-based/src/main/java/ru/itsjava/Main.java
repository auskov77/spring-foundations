package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("ru.itsjava.configuration")
public class Main {

    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(Main.class);
//        Animal piglet = context.getBean("myBestPiglet", Animal.class);
//        Animal piglet = context.getBean("piglet", Animal.class);
//        piglet.say();

        KingFarmer farmer = context.getBean("farmer", KingFarmer.class);
        farmer.hi();
    }
}
