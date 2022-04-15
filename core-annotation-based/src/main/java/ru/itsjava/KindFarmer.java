package ru.itsjava;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("farmer")
//@RequiredArgsConstructor
public class KindFarmer {

    private final Animal animal;

    public KindFarmer(@Qualifier("piglet") Animal animal) {
        this.animal = animal;
    }

//    public void setAnimal(Animal animal) {
//        this.animal = animal;
//    }

    public void hi() {
        System.out.println("I say hi to animal");
        animal.say();
    }
}
