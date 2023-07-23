import java.util.*;
import javax.swing.*;
import java.awt.*;

public class SignupOne extends JFrame {

    SignupOne(){

        Random ran = new Random();
        System.out.println(ran.nextLong());
        JLabel formno = new JLabel("APPLICATION FORM NO. " + );

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupOne();
    }    
}