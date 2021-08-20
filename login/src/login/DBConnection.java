/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.*;

/**
 *
 * @author aleqz
 */
public class DBConnection {

    static final String URL = "jdbc:mysql://localhost/testsql";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static Connection connectDB() {
        Connection con = null;
        try {
            // Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(URL, USER, PASSWORD);
            return con;
        } catch (Exception ex) {
            return null;
        }
    }

}
