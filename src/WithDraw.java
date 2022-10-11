import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import AccountDetails.*;

public class WithDraw extends Login_SignUp {

    //Variables for class
    JFrame withdraw_frame = new JFrame("Withdraw your Money");
    JButton wd_button = new JButton("Withdraw");
    JButton CurrentBal = new JButton("Current Balance");

    WithDraw() {
        //JFrame withdraw_frame = new JFrame("Withdraw your Money");
        withdraw_frame.setVisible(true);
        withdraw_frame.setLayout(new FlowLayout());
        withdraw_frame.setBounds(300, 300, 300, 300);
        withdraw_frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        withdraw_frame.add(new JLabel("Total Amount to Withdraw:"));

        JTextField withdraw_money = new JTextField("Enter Amount");
        withdraw_frame.add(withdraw_money);

        //JButton wd_button = new JButton("Withdraw");
        withdraw_frame.add(wd_button);

        withdraw_frame.add(CurrentBal);
        CurrentBalActionListener();

    }

    //Withdraw action listener
    public void wd_buttonActionListener(){
        wd_button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JLabel txt;
                //**********************************************************************************************
                /*if () {
                    txt = new JLabel("Money Withdrawn");
                } else {
                    txt = new JLabel("Transaction Discarded due to Error");
                }*/
            }
        });
    }

    public void CurrentBalActionListener(){
        CurrentBal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                Account ac = new Account();
                String cno = Card_text.getText();
                System.out.println(cno);
                JOptionPane.showMessageDialog(withdraw_frame,ac.setBalance(cno));

            }
        });
    }
}
