package org.example.crapsgame.model;

//INTERFACES are molds that allows other classes to implement its methods
//Java doesn't have multiple inherit, that's why interfaces appear
//Only are inherited signature methods and constants
//If all classes need an x method, it will be in signature otherwise in default

//An Interface Cannot be instanced, that's why doesn't have constructor
public interface IAnimal { //Convension, "I" at the beggining from interfaces

    //(Si un metodo actua distinto en todas las clases que implementen de la interfaz; es(signature))
    public void makeSound(); //signature (it's indicated)

    String TYPE = "Animal"; //constant var

    //(Si un metodo actua igual en todas las clases que implementen de la interfaz; es(default))
    default void spleep(){
        System.out.println("zzzzzzzz"); //(it's not indicated)

    }

}


