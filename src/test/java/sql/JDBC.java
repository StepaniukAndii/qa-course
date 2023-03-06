package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC {

    private static final String DB_DRIVER = "jdbc:postgresql://localhost:5432/db";
    private static final String DB_DRIVER_CLASS = "org.postgresql.Driver";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName(DB_DRIVER_CLASS);

        DriverManager.getConnection(DB_DRIVER, "postgres", "password");

    }
}
