import javax.swing.*;
import java.awt.*;          //awt = abstract windowing toolkit
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* JFrame uses Card Layout by default
* It replaces initial add() function and overwrites it*/
class Login_SignUp extends JFrame{

    JFrame lgsg_Frame = new JFrame("ATM Walk-through Project");

    JLabel Card_label = new JLabel("Card Number : ");
    JLabel Pswrd_label = new JLabel("Password : ");
    JLabel CVV_label = new JLabel("CVV : ");
    JTextField Card_text = new JTextField(12);
    JPasswordField Pswrd_Text = new JPasswordField(20);
    JPasswordField CVV_Text = new JPasswordField(3);
    JButton login_button = new JButton("Log In");        //create login button

    Login_SignUp(){          // Constructor with JFrame methods
        //JFrame lgsg_Frame = new JFrame("ATM Walk-through Project");
        lgsg_Frame.setVisible(true);
        lgsg_Frame.setLayout(new FlowLayout());
        lgsg_Frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lgsg_Frame.setBounds(300, 300, 300, 250);


        /*JLabel Card_label = new JLabel("Card Number : ");
        JLabel Pswrd_label = new JLabel("Password : ");
        JLabel CVV_label = new JLabel("CVV : ");
        JTextField Card_text = new JTextField(12);
        JPasswordField Pswrd_Text = new JPasswordField(20);
        JPasswordField CVV_Text = new JPasswordField(3);*/


        lgsg_Frame.add(Card_label);
        lgsg_Frame.add(Card_text);
        lgsg_Frame.add(Pswrd_label);
        lgsg_Frame.add(Pswrd_Text);
        lgsg_Frame.add(CVV_label);
        lgsg_Frame.add(CVV_Text);
        //JButton login_button = new JButton("Log In");        //create login button
        login_button.setBounds(320, 400, 20, 7);
        lgsg_Frame.add(login_button);                               //add login button

        LoginActionListener();

    }      //Constructor which creates frame of Login box

    public void LoginActionListener(){
        login_button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //JLabel txt = new JLabel("Clicked");
                Login lg = new Login();
                lg.setVisible(true);
                lgsg_Frame.setVisible(false);

            }
        });
    }
}


