import javax.swing.*;
import java.awt.*;          //awt = abstract windowing toolkit

/*
* JFrame uses Card Layout by default
* It replaces initial add() function and overwrites it*/
class Login_SignUp extends JFrame{              //GUI for login page
    Login_SignUp(){          // Constructor with JFrame methods
        JFrame lgsg_Frame = new JFrame("ATM Walk-through Project");
        lgsg_Frame.setVisible(true);
        lgsg_Frame.setLayout(new FlowLayout());
        lgsg_Frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lgsg_Frame.setBounds(300, 300, 300, 250);


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
        login_button.setBounds(320, 400, 20, 7);
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

class Login extends JFrame{
    public Login() {
        JFrame login_page = new JFrame("Edit Money");
        login_page.setVisible(true);
        login_page.setLayout(new FlowLayout());
        login_page.setDefaultCloseOperation(EXIT_ON_CLOSE);
        login_page.setBounds(350, 350, 250, 250);

        JButton Withdraw = new JButton("Withdraw Money");
        JButton CurrentBal = new JButton("Current Balance");
        JButton Deposit = new JButton("Deposit Money");

        login_page.add(Withdraw);
        login_page.add(Deposit);
        login_page.add(CurrentBal);
    }
}
class WithDraw extends JFrame{
    WithDraw(){
        JFrame withdraw_frame = new JFrame("Withdraw your Money");
        withdraw_frame.setVisible(true);
        withdraw_frame.setLayout(new FlowLayout());
        withdraw_frame.setBounds(300,300,300,300);
        withdraw_frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        withdraw_frame.add(new JLabel("Total Amount to Withdraw:"));

        JTextField withdraw_money = new JTextField("Enter Amount");
        withdraw_frame.add(withdraw_money);

        JButton wd_button = new JButton("Withdraw");
        withdraw_frame.add(wd_button);

    }
}

class Deposit extends JFrame{
    Deposit(){
        JFrame deposit_frame = new JFrame("Deposit your Money");
        deposit_frame.setVisible(true);
        deposit_frame.setLayout(new FlowLayout());
        deposit_frame.setBounds(300,300,300,300);
        deposit_frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        deposit_frame.add(new JLabel("Total Amount to Deposit:"));

        JTextField deposit_money = new JTextField("Enter Amount");
        deposit_frame.add(deposit_money);

        JButton dep_button = new JButton("Deposit");
        deposit_frame.add(dep_button);
    }
}


