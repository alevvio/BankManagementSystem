package BankManagementSystemPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Connectio {

    public static void main(String[] args) throws Exception {
        
        try {
            //establish connection
            String url = "jdbc:mysql://localhost:3306/";

            String databaseName = "BankManagementSystem";
            String userName = "root";
            String password = "AK4756lexpc!";
    
            Connection conn = DriverManager.getConnection(url,userName, password);
            
            //create statement
            Statement s = conn.createStatement();
            
            //Execute Query
            String sql = "CREATE DATABASE " + databaseName;
            s.execute(sql);

            //message dialog box
            JOptionPane.showMessageDialog(null, databaseName + " Database has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
            
            //close connection
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}