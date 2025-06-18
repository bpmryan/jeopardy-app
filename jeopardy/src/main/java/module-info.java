module com.example.jeopardy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jeopardy to javafx.fxml;
    exports com.example.jeopardy;
}