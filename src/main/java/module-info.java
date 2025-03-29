module com.virtuaalpet.virtualpet {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.virtuaalpet.virtualpet to javafx.fxml;
    exports com.virtuaalpet.virtualpet;
}