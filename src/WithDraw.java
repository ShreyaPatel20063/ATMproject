import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import AccountDetails.*;

public class WithDraw extends Login_SignUp{

    //Variables for class
    JFrame withdraw_frame = new JFrame("Withdraw your Money");
    JButton wd_button = new JButton("Withdraw");

    JTextField withdraw_money = new JTextField(6);
    JButton back = new JButton("BACK");

    WithDraw(Account ac, String cno) {

        super(ac);
        lgsg_Frame.setVisible(false);

        withdraw_frame.setVisible(true);
        withdraw_frame.setLayout(new FlowLayout());
        withdraw_frame.setBounds(300, 300, 300, 300);
        withdraw_frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        withdraw_frame.add(new JLabel("Total Amount to Withdraw:"));
        withdraw_frame.add(withdraw_money);
        withdraw_frame.add(wd_button);
        withdraw_frame.add(back);

        wd_buttonActionListener(ac,cno);
        backActionListener(ac, cno);
    }

    /** getWithdraw returns the balance to deduct from the original balance
     * if the textfield is empty, it will show "Amount not Entered or incorrect"
     * in that case, it returns 0
     * if the text field has letters in input, it will show same error msg
     * else it returns the entered number*/

    Double getWithdraw(){
        Double Withdrawmoney;
        try{
            Withdrawmoney = Double.valueOf(withdraw_money.getText());
            return Withdrawmoney;
        }catch (Exception e){
            JOptionPane.showMessageDialog(withdraw_frame, "Amount not Entered or Incorrect");
            return 0.0;
        }
    }

    /** withdraw button's actionlistener
     * it will pass cno and ac
     * if textbox is empty, balance will not b displayed*/

    public void wd_buttonActionListener(Account ac, String cno){
        wd_button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //Account ac = new Account();
                int index = ac.index(cno);
                if (getWithdraw() !=0.0) {
                    ac.withBalance(index, getWithdraw());
                    JOptionPane.showMessageDialog(withdraw_frame, ac.setBalance(cno));
                }
            }
        });
    }

    /** Only for going back to the withdraw/deposit/currentBalance page*/

    public void backActionListener(Account ac, String cno){
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Login lg = new Login(ac, cno);
                withdraw_frame.setVisible(false);
                lg.setVisible(true);
            }
        });
    }

}
