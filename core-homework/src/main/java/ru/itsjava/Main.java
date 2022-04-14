package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.services.CoffeeHouse;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("context.xml");

        CoffeeHouse coffeeHouse = context.getBean("coffeeHouse", CoffeeHouse.class);
        coffeeHouse.giveOutCoffeeAccordingToPriceList();
    }
}
