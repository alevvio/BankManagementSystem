import java.util.*;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame {

    SignupOne(){

        setLayout(null);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong()%9000L)+1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        JTextField nametf = new JTextField();
        nametf.setFont(new Font("Raleway", Font.BOLD, 14));
        nametf.setBounds(300, 140, 400, 30);
        add(nametf);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        JTextField fnametf = new JTextField();
        fnametf.setFont(new Font("Raleway", Font.BOLD, 14));
        fnametf.setBounds(300, 190, 400, 30);
        add(fnametf);

        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        JDateChooser dobchoose = new JDateChooser();
        dobchoose.setBounds(300, 240, 400, 30);
        dobchoose.setForeground(new Color(105, 105, 105));
        add(dobchoose);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email Address");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        JTextField emailtf = new JTextField();
        emailtf.setFont(new Font("Raleway", Font.BOLD, 14));
        emailtf.setBounds(300, 340, 400, 30);
        add(emailtf);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        JRadioButton other = new JRadioButton("Other");
        other.setBounds(600, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        ButtonGroup maritalGroup=new ButtonGroup();
        genderGroup.add(married);
        genderGroup.add(unmarried);
        genderGroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        JTextField addresstf = new JTextField();
        addresstf.setFont(new Font("Raleway", Font.BOLD, 14));
        addresstf.setBounds(300, 440, 400, 30);
        add(addresstf);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        JTextField citytf = new JTextField();
        citytf.setFont(new Font("Raleway", Font.BOLD, 14));
        citytf.setBounds(300, 490, 400, 30);
        add(citytf);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        JTextField statetf = new JTextField();
        statetf.setFont(new Font("Raleway", Font.BOLD, 14));
        statetf.setBounds(300, 540, 400, 30);
        add(statetf);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        JTextField pintf = new JTextField();
        pintf.setFont(new Font("Raleway", Font.BOLD, 14));
        pintf.setBounds(300, 590, 400, 30);
        add(pintf);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setBackground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupOne();
    }    
}