import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import AccountDetails.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Deposit extends Login_SignUp{

    JFrame deposit_frame = new JFrame("Deposit your Money");
    JTextField deposit_money = new JTextField(6);
    JButton dep_button = new JButton("Deposit");
    JButton back = new JButton("BACK");
    //JButton CurrentBal = new JButton("Current Balance");

    Deposit(Account ac, String cno) {
        super(ac);
        lgsg_Frame.setVisible(false);
        //JFrame deposit_frame = new JFrame("Deposit your Money");
        deposit_frame.setVisible(true);
        deposit_frame.setLayout(new FlowLayout());
        deposit_frame.setBounds(300, 300, 300, 300);
        deposit_frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        deposit_frame.add(new JLabel("Total Amount to Deposit:"));

        //JTextField deposit_money = new JTextField("Enter Amount");
        // field for adding money input
        deposit_frame.add(deposit_money);

        //JButton dep_button = new JButton("Deposit");
        //Button for depositing money
        deposit_frame.add(dep_button);
        deposit_frame.add(back);

        //deposit_frame.add(CurrentBal);
        //CurrentBalActionListener(cno);
        dep_buttonActionListener(ac,cno);
        backActionListener(ac,cno);
    }

    Double getDeposit(){
        Double Depositmoney;
        try {
            Depositmoney = Double.valueOf(deposit_money.getText());
            return Depositmoney;
        }catch (Exception e){
            JOptionPane.showMessageDialog(deposit_frame, "Amount not Entered");
            return 0.0;
        }

    }


    //action listeners
    public void dep_buttonActionListener(Account ac, String cno){
        dep_button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Account ac = new Account();
                int index = ac.index(cno);
                if (getDeposit() != 0.0) {
                    ac.depoBalance(index, getDeposit());
                    JOptionPane.showMessageDialog(deposit_frame, ac.setBalance(cno));
                }
            }
        });
    }
    public void backActionListener(Account ac,String cno){
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Login lg = new Login(ac,cno);
                deposit_frame.setVisible(false);
                lg.setVisible(true);
            }
        });
    }
}
