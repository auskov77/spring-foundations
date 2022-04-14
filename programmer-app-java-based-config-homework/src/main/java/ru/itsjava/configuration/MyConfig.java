package ru.itsjava.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.services.*;

import java.io.InputStream;

@Configuration
public class MyConfig {
//    @Value("${coffee.type}")
//    private String type;
//    @Value("${notebook.model}")
//    private String model;
//    @Value("${notebook.year}")
//    private int year;
    @Value("#{T(java.lang.System).in}")
    private InputStream inputStream;

    @Bean
    public CoffeeService coffeeService(){
        return new CoffeeServiceImpl();
    }

    @Bean
    public InputService inputService(){
        return new InputServiceImpl();
    }

    @Bean
    public CoffeeHouse coffeeHouse(CoffeeService coffeeService, InputService inputService){
        return new CoffeeHouseImpl(coffeeService,inputService);
    }

}
