package ru.itsjava.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.itsjava.Animal;
//import ru.itsjava.KingFarmer;
import ru.itsjava.Lamb;
import ru.itsjava.Piglet;

@Import(OtherConfig.class)
@Configuration
public class MyConfig {

//    @Bean("myBestPiglet")
    @Bean
    public Animal piglet(){
        return new Piglet();
    }

    @Bean
    public Animal lamb(){
        return new Lamb();
    }
//
//    @Bean
//    public KingFarmer farmer(Animal animal){
//        return new KingFarmer(animal);
//    }
}
