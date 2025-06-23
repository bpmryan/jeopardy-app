package com.example.jeopardyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class QuestionController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void finalJeopardyButtonClick(ActionEvent actionEvent) {
    }

    public void submitButtonClick(ActionEvent actionEvent) {
    }
}