package org.example.crapsgame.model;

public class Dog implements IAnimal{
    //Only nedded to implement signatures not const (const automaticly included)
    //Not implement default methods
    @Override
    public void makeSound() {
        System.out.println("Guau Guau");

    }
}
