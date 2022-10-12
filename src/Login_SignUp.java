import javax.swing.*;
import java.awt.*;          //awt = abstract windowing toolkit
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import AccountDetails.*;

/*
* JFrame uses Card Layout by default
* It replaces initial add() function and overwrites it*/
class Login_SignUp extends JFrame{

    JFrame lgsg_Frame = new JFrame("ATM Walk-through Project");         // frame created

    JLabel Card_label = new JLabel("Card Number : ");                   //card number label
    JLabel Pswrd_label = new JLabel("Password : ");                     //password label
    JLabel CVV_label = new JLabel("CVV : ");                            //cvv label
    public JTextField Card_text = new JTextField(12);                //card number textbox
    JPasswordField Pswrd_Text = new JPasswordField(20);              //password textbox - password type
    JPasswordField CVV_Text = new JPasswordField(3);                 //cvv textbox - password type
    JButton login_button = new JButton("Log In");                       //login button

    /**Constructor has all the components added in frame*/

    Login_SignUp(Account ac){          // Constructor with JFrame methods

        //frame created
        lgsg_Frame.setVisible(true);                                    //frame shown
        lgsg_Frame.setLayout(new FlowLayout());                         //layout setup
        lgsg_Frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);          //close button activate
        lgsg_Frame.setBounds(300, 300, 300, 250);     //location of frame on screen

        // operations added to frame
        lgsg_Frame.add(Card_label);
        lgsg_Frame.add(Card_text);
        lgsg_Frame.add(Pswrd_label);
        lgsg_Frame.add(Pswrd_Text);
        lgsg_Frame.add(CVV_label);
        lgsg_Frame.add(CVV_Text);
        login_button.setBounds(320, 400, 20, 7);
        lgsg_Frame.add(login_button);                               //add login button

        LoginActionListener(ac);                                    //Login button reader
    }

    /** Login ActionListener has a validation function
     * if data is verified, the process will go on
     * else msg will be displayed ERROR*/

    public void LoginActionListener(Account ac){

            login_button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (detailsValidation(ac)){
                        //JLabel txt = new JLabel("Clicked");
                        Login lg = new Login(ac, getCNO());
                        lg.setVisible(true);
                        lgsg_Frame.setVisible(false);

                    }else {
                        JOptionPane.showMessageDialog(lgsg_Frame, "Login Unsuccessful, Pswrd/CVV does not match!!");
                    }
                }
            });

    }

    /** getCNO returns the card number*/

    String getCNO(){
        String cno = Card_text.getText();
        return cno;
    }

    /** validate function returns
     * TRUE for arraylist containing card details
     * FALSE for arraylist and given details does not match*/

    boolean detailsValidation(Account ac){
        String  cvv;
        String cno = getCNO();
        cvv = String.valueOf(CVV_Text.getPassword());
        String pswrd = String.valueOf(Pswrd_Text.getPassword());

        //Account ac = new Account();
        return ac.containAc(cno, pswrd, cvv);
    }

}


