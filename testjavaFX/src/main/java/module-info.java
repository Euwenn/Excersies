module org.example.testjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.testjavafx to javafx.fxml;
    exports org.example.testjavafx;
}