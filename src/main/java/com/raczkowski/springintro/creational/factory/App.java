package com.raczkowski.springintro.creational.factory;

import static com.raczkowski.springintro.creational.factory.Database.ORACLE;

public class App {
    public static void main(String[] args) {
        DatabaseConnectionFactory databaseConnectionFactory = new DatabaseConnectionFactory();
        Connection connection = databaseConnectionFactory.getConnection(ORACLE);
        connection.connect();
    }
}
