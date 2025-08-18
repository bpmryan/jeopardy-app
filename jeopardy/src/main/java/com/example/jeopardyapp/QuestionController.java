package com.example.jeopardyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class QuestionController {

    private Stage stage;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    //Opens the final jeopardy question
    public void finalJeopardyButtonClick(ActionEvent actionEvent) {
    }


    //opens the Question Board scene
    public void submitButtonClick(javafx.event.ActionEvent ActionEvent) throws IOException {
        //create the question board grid through the questionPage

        FXMLLoader fxmlLoader = new FXMLLoader(QuestionApp.class.getResource("fiveCategories.fxml"));
        stage = (Stage)((Node)ActionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Question Grid");
        stage.setScene(scene);
        stage.show();
    }
}