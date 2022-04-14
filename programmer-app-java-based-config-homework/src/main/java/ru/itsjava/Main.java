package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.PropertySource;
import ru.itsjava.services.CoffeeHouse;

@ComponentScan("ru.itsjava.configuration")
//@PropertySource("classpath:app.properties")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(Main.class);

        CoffeeHouse coffeeHouse = context.getBean("coffeeHouse", CoffeeHouse.class);
        coffeeHouse.giveOutCoffeeAccordingToPriceList();
    }
}
