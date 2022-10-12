import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import AccountDetails.*;

public class Deposit extends Login_SignUp{

    JFrame deposit_frame = new JFrame("Deposit your Money");
    JTextField deposit_money = new JTextField(6);
    JButton dep_button = new JButton("Deposit");
    JButton back = new JButton("BACK");


    Deposit(Account ac, String cno) {
        super(ac);
        lgsg_Frame.setVisible(false);
        //JFrame deposit_frame = new JFrame("Deposit your Money");
        deposit_frame.setVisible(true);
        deposit_frame.setLayout(new FlowLayout());
        deposit_frame.setBounds(300, 300, 300, 300);
        deposit_frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        deposit_frame.add(new JLabel("Total Amount to Deposit:"));
        deposit_frame.add(deposit_money);

        deposit_frame.add(dep_button);
        deposit_frame.add(back);

        dep_buttonActionListener(ac,cno);
        backActionListener(ac,cno);
    }

    /** getDeposit method is used to handle exception
     * if text value is empty or has characters, it will display msg that "Amount not Entered / Incorrect Syntax"
     * else it will return Double value to be deducted from the current balance*/
    Double getDeposit(){
        Double Depositmoney;
        try {
            Depositmoney = Double.valueOf(deposit_money.getText());
            return Depositmoney;
        }catch (Exception e){
            JOptionPane.showMessageDialog(deposit_frame, "Amount not Entered / Incorrect Syntax");
            return 0.0;
        }

    }

    /** deposit button actionListener
     * it will pass cno and ac
     * if textbox is empty, balance will not b displayed*/
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

    /** back button action listener
     * returns to the withdraw/deposit/currentBalance page*/
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
