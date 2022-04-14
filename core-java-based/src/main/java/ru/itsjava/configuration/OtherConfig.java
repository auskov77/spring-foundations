package ru.itsjava.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
import ru.itsjava.Animal;
import ru.itsjava.KingFarmer;

//@Configuration
public class OtherConfig {

    @Bean
    public KingFarmer farmer(@Qualifier("piglet") Animal animal){
        return new KingFarmer(animal);
    }
}
