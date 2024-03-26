package org.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;

public class GameController {
    @FXML
    private TextField nicknameTextField;
    @FXML
    private Button questionButton;

    @FXML
    public void onHandleButtonPlay(ActionEvent event){
        String nickname = nicknameTextField.getText();
        System.out.println(nickname);
    }

    @FXML
    public void onHandleButtonQuestion(ActionEvent event){
        System.out.println("Question has been Shown");
    }

    @FXML
    void onMouseReleasedButtonQuestion(MouseEvent event) {
        questionButton.setStyle("-fx-background-color: red;");
    }

    @FXML
    void onHandleTextArea(ActionEvent event) {

    }

}
