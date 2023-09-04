package BankManagementSystemPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conn {
   
    Connection c;
    Statement s;

    public Conn() throws SQLException, SQLTimeoutException {
        try {
            //establish connection
            String url = "jdbc:mysql://localhost:3306/BankManagementSystem";

            String userName = "root";
            String password = "AK4756lexpc!";

            c = DriverManager.getConnection(url,userName, password);
            
            //create statement
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}