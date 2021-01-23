package com.raczkowski.springintro.creational.factory;

import static com.raczkowski.springintro.creational.factory.Database.MYSQL;
import static com.raczkowski.springintro.creational.factory.Database.ORACLE;

public class DatabaseConnectionFactory {

    public Connection getConnection(Database database) {
        if (database.equals(ORACLE)) {
            return new OracleDatabaseConnection();
        } else if (database.equals(MYSQL)){
            return new MySQLDatabaseConnection();
        }

        throw new IllegalArgumentException("Database type: " + database + " unknown");
    }

}
