package dev.pedrosantayana.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public Connection connection;
    public Database() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:./database.db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
