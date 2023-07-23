import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    Login(){

        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200,40,400,30);
        text.setFont(new Font("Osward", Font.BOLD, 38));
        add(text);

        JLabel cardno = new JLabel("Card No.:");
        cardno.setBounds(120,150,150,30);
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        add(cardno);

        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setBounds(120, 220,250,30);
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        add(pin);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300, 220, 230, 30);
        add(pinTextField);

        JButton login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);

        JButton clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        add(clear);

        getContentPane().setBackground(Color.WHITE);;
        
        setSize(800, 480);
        setLocation(350, 200);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Login();
    }    
}