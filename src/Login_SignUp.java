import javax.swing.*;
import java.awt.*;          //awt = abstract windowing toolkit

/*
* JFrame uses Card Layout by default
* It replaces initial add() function and overwrites it*/
public class Login_SignUp extends JFrame{              //GUI for login page
    JFrame lgsg_Frame;
    Login_SignUp(){          // Constructor with JFrame methods
        lgsg_Frame = new JFrame("ATM Walk-through Project");
        //lgsg_Frame.setLayout(new GridBagLayout());

        lgsg_Frame.setBounds(300, 300, 350, 350);
        lgsg_Frame.setVisible(true);
        lgsg_Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel Card_label = new JLabel("Card Number : ");
        JLabel Pswrd_label = new JLabel("Password : ");
        JLabel CVV_label = new JLabel("CVV : ");
        JTextField Card_text = new JTextField(12);
        JPasswordField Pswrd_Text = new JPasswordField(20);
        JPasswordField CVV_Text = new JPasswordField(3);

        lgsg_Frame.add(Card_label);
        lgsg_Frame.add(Card_text);
        lgsg_Frame.add(Pswrd_label);
        lgsg_Frame.add(Pswrd_Text);
        lgsg_Frame.add(CVV_label);
        lgsg_Frame.add(CVV_Text);
        JButton login_button = new JButton("Log In");        //create login button
        // login_button.setBounds(320, 400, 20, 7);
        lgsg_Frame.add(login_button);                               //add login button

    }      //Constructor which creates frame of Login box

    public void FrameSetup(){
        setLayout(new FlowLayout());
                                    //Flowlayout- (awt),    BorderLayout-(awt),     CardLayout-(awt)    *GridLayout-(awt)   *GridBagLayout-(awt)
                                    //Boxlayout-(swing)  *OverlayLayout-(swing)
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //this is used to close the window
                                                            // JFrame.EXIT_ON_CLOSE = 3
                                                            // need to give a const int in the field
    }
}

class Login extends Login_SignUp{
    public Login() {
        super();
    }
}

