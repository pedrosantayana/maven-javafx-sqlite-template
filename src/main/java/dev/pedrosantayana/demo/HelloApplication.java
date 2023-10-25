package dev.pedrosantayana.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Database db = new Database();

        Statement stmt = null;
        try {
            stmt = db.connection.createStatement();
            stmt.executeUpdate("create table pessoa(id, name)");
            stmt.executeUpdate("insert into pessoa values(1, 'pedro')");
            stmt.executeUpdate("insert into pessoa values(2, 'joao')");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        launch();
    }
}