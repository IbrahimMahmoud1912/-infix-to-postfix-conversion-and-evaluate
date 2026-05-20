module com.example.datastr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datastr to javafx.fxml;
    exports com.example.datastr;
}