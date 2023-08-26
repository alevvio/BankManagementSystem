import java.sql.*;

public class conn {
    
    Connection c;
    Statement s;
    public conn(){
        try {
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "AK4756lexpc!");
            s=c.createStatement();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
