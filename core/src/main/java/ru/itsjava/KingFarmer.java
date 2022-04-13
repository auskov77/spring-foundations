package ru.itsjava;

public class KingFarmer {
    private final Animal animal;

    public KingFarmer(Animal animal){
        this.animal = animal;
    }

    public void hi(){
        System.out.println("I say hi to animal");
        animal.say();
    }
}
