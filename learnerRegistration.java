import java.util.Scanner;

public class Registration
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Registration extends jFrame implements ActionListener(one line)
{JLabel 11, 12, 13, 14, 15, 16, 17, 18;
JTextField tf1, tf2, tf5. tf6, tf7;
Jbutton btn1, btn2;
JpassswordField p1, p2;
Registration()
}

setVisible(true);
setSize(700, 700);
setLayout(null);
setDefaultCloseOperation(JFrame, EXIT_ON_Close);
SetTitle("Mzamomtsha Primary School Registration Form");
11 = new Jlabel("Registration in Windows Form");
11. setForeground(Colour.blue);
11. setFont(newFont("Serif", font.bold, 20);
12 = new ("Name :");
13 = new JLabel("ID :");
14 = new JLabel("Physial Address :");
15 = new JLable("Age :");
16 = new JLable("Guardian Name :");
17 = new JLable("Guardian ID :");
tf1 = new JTextField();
tf2 = new JtextField();
p1 = new JPasswordField();
p2 = new JPassword();
btn1 = newJbutton("Submit");
btn2 = newJButton("Clear");
btn1.addActionListener(this);
btn2.addActionListener(this);
11.setBounds(100, 30, 400, 30);
12.setBounds(80, 70, 200, 30);
13.setBounds(80, 110, 200, 30);
14.setBounds(80, 150, 200, 30);
15.setBounds(80, 190, 200, 30);
16.setBounds(80, 230, 200, 30);
17.setBounds(80, 270, 200, 30);
18.setBounds(80, 310, 200, 30);
tf1.setBounds(300, 70, 200, 30);
tf2.setBounds(300, 110, 200, 30);
p1.setBounds(300, 150, 200, 30);
p2.setBounds(300, 190, 200, 30);
tf5.setBounds(300, 230, 200, 30);
tf6.setBounds(300, 270, 200, 30);
tf7.setBounds(300, 310, 200, 30);
btn1.setBounds(50, 350, 100, 30);
btn2.setBounds(170, 350, 100, 30);
add(11);
add(12);
add(tf1);
add(tf2);
add(13);
add(tf2);
add(14);
add(p1);
add(15);
add(p2);
add(16);
add(tf6);
add(18);
add(tf7);
add(btn1);
add(btn2);}

public class learnerRegistration {
    public static void main(String[] args) {
       
    	String name, surname, homeAddress;
    	String age;
		String parentNumber;
		String grade;
    	boolean isRegistered;
    	
    	Scanner objint = new Scanner (System.in);
    	
       System.out.println("Enter learner name");
       name=objint.next();
       
       System.out.println("Enter learner surname");
       surname=objint.next();
       
       System.out.println("Enter learner age");
       age=objint.next();
       
       System.out.println("Enter learner grade");
       grade=objint.next();
       
       System.out.println("Enter home address");
       homeAddress=objint.next();
       
       System.out.println("Enter parent's contact number");
       parentNumber=objint.next();
       
       String result;
	if (isRegistered) 
       result = "Application successful";
       
       if NOT (isRegistered)
       result = "unsuccessful";
       
       System.out.println("If application is successful, you will recieve a call from the school");
       
    }
}