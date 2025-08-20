package com.example.jeopardyapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AnswerTemplate {

    @FXML private Button returnQuestonBoardButton; // note the fx:id typo in FXML

    private Stage stage;

    @FXML
    private void initialize() {
        if (returnQuestonBoardButton != null) {
            returnQuestonBoardButton.setOnAction(e -> closeWindow());
        }
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setCategoryAndValue(String category, int value) {
        // If you later add fx:id fields for category/value in the answer FXML, populate them here.
    }

    private void closeWindow() {
        if (stage == null) {
            if (returnQuestonBoardButton != null) {
                Stage s = (Stage) returnQuestonBoardButton.getScene().getWindow();
                s.close();
                return;
            }
        }
        stage.close();
    }
}
