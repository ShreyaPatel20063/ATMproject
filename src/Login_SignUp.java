import javax.swing.*;
import java.awt.*;          //awt = abstract windowing toolkit
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import AccountDetails.*;

/*
* JFrame uses Card Layout by default
* It replaces initial add() function and overwrites it*/
class Login_SignUp extends JFrame{

    JFrame lgsg_Frame = new JFrame("ATM Walk-through Project");

    JLabel Card_label = new JLabel("Card Number : ");
    JLabel Pswrd_label = new JLabel("Password : ");
    JLabel CVV_label = new JLabel("CVV : ");
    public JTextField Card_text = new JTextField(12);
    JPasswordField Pswrd_Text = new JPasswordField(20);
    JPasswordField CVV_Text = new JPasswordField(3);
    JButton login_button = new JButton("Log In");        //create login button



    Login_SignUp(){          // Constructor with JFrame methods

        //frame created
        lgsg_Frame.setVisible(true);
        lgsg_Frame.setLayout(new FlowLayout());
        lgsg_Frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lgsg_Frame.setBounds(300, 300, 300, 250);

        // operations added to frame
        lgsg_Frame.add(Card_label);
        lgsg_Frame.add(Card_text);
        lgsg_Frame.add(Pswrd_label);
        lgsg_Frame.add(Pswrd_Text);
        lgsg_Frame.add(CVV_label);
        lgsg_Frame.add(CVV_Text);
        login_button.setBounds(320, 400, 20, 7);
        lgsg_Frame.add(login_button);                               //add login button

        LoginActionListener();


    }      //Constructor which creates frame of Login box

    public void LoginActionListener(){

            login_button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (detailsValidation()){
                        //JLabel txt = new JLabel("Clicked");
                        Login lg = new Login();
                        lg.setVisible(true);
                        lgsg_Frame.setVisible(false);

                    }else {
                        JOptionPane.showMessageDialog(lgsg_Frame, "Login Unsuccessful, Pswrd/CVV does not match!!");
                    }
                }
            });

    }

    boolean detailsValidation(){
        String  cvv;
        String cno = Card_text.getText();
        cvv = String.valueOf(CVV_Text.getPassword());
        String pswrd = String.valueOf(Pswrd_Text.getPassword());

        JLabel txt = new JLabel(cno);
        JLabel txt1 = new JLabel(cvv);
        JLabel txt2 = new JLabel(pswrd);
        lgsg_Frame.add(txt);
        lgsg_Frame.add(txt1);
        lgsg_Frame.add(txt2);

        Account ac = new Account();
        return ac.containAc(cno, pswrd, cvv);
    }


}


