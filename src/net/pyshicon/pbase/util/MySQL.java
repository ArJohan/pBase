package net.pyshicon.pbase.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {

    private String address;
    private String database;
    private String username;
    private String password;
    private Connection connection;
    private Statement statement;

    public MySQL(String address, String database, String username, String password) {
        this.address = address;
        this.database = database;
        this.username = username;
        this.password = password;
    }

    public void openConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://" + this.address + "/" + this.database, this.username, this.password);
        statement = connection.createStatement();
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }
}
