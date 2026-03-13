package main.java;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginService {

    public boolean login(String username, String password) {

        Connection connection =
                DriverManager.getConnection("Aqui deberia ir mi Link a la base de datos ");

             String sql = "SELECT * FROM users WHERE username = " + username + "And password = " password;

        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        return rs.next();

    }
}
