module com.example.info5100_ex9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.info5100ex9 to javafx.fxml;
    exports com.example.info5100ex9;
}