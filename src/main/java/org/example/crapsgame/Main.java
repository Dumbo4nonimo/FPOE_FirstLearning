package org.example.crapsgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.example.crapsgame.model.Cat;
import org.example.crapsgame.model.Dog;
import org.example.crapsgame.model.Human;
import org.example.crapsgame.model.SuperMario;

import java.io.IOException;

//FIRST ON A PROJECT: create Main class, after create the packages

public class Main extends Application  { //Main inherits from Application(Parent) Class

    public static void main(String[] args) {

        Dog pitbull = new Dog();
        Cat whiskas = new Cat();


        pitbull.makeSound();
        whiskas.makeSound();

        System.out.print("Dog does: "); //sout without ln
        whiskas.spleep();
        SuperMario mario = new SuperMario();
        mario.to_speak();

        Application.launch(args); //this line calls start method and send args
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/org/example/crapsgame/welcome-view.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Juego de Craps");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
/*      primaryStage.setTitle("TheBootlegBoy");
        primaryStage.setResizable(true);
        primaryStage.setWidth(440);
        primaryStage.setHeight(400);
Group root = new Group(); //Parent root = loader.load(); otherwise
Scene scene = new Scene(root, 400, 225);
        primaryStage.setScene(scene);

        primaryStage.show();*/
