module dev.pedrosantayana.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens dev.pedrosantayana.demo to javafx.fxml;
    exports dev.pedrosantayana.demo;
}