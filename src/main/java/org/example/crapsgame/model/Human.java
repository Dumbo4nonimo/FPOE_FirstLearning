package org.example.crapsgame.model;

//extends means inherit
//an interface can extend from other interface
public interface Human extends IAnimal{
    //In filosofy a human is an animal, here Human has all methods from Animal
    public void to_speak ();
    default void razionalize(){
        System.out.println("Capacity to made decitions");
    };

}

