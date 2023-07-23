import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton signin = new JButton("SIGN IN");
    JButton clear = new JButton("CLEAR");
    JButton signup = new JButton("SIGNUP");
    JTextField cardTextField = new JTextField();
    JPasswordField pinTextField = new JPasswordField();

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

        cardTextField.setBounds(300, 150, 230, 30);
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setBounds(120, 220,250,30);
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        add(pin);

        pinTextField.setBounds(300, 220, 230, 30);
        add(pinTextField);
        
        signin.setBounds(300, 300, 100, 30);
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);

        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        add(clear);

        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        add(signup);

        getContentPane().setBackground(Color.WHITE);;
        
        setSize(800, 480);
        setLocation(350, 200);
        setVisible(true);

        }

        public void actionPerformed(ActionEvent ae){
            
            if(ae.getSource()==clear){
                cardTextField.setText("");
                pinTextField.setText("");
            }

            else if(ae.getSource()==signin){

            }

            else if(ae.getSource()==signup){

            }
        }
    
    public static void main(String[] args) {
        new Login();
    }    
}