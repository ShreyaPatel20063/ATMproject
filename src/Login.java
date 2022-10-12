import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import AccountDetails.*;

public class Login extends JFrame {

    JFrame login_page = new JFrame("Edit Money");
    JButton Withdraw = new JButton("Withdraw Money");
    JButton CurrentBal = new JButton("Current Balance");

    JButton Deposit = new JButton("Deposit Money");

    public Login(Account ac,String cno) {
        //JFrame login_page = new JFrame("Edit Money");
        login_page.setVisible(true);
        login_page.setLayout(new FlowLayout());
        login_page.setDefaultCloseOperation(EXIT_ON_CLOSE);
        login_page.setBounds(350, 350, 250, 250);

        /*JButton Withdraw = new JButton("Withdraw Money");
        JButton CurrentBal = new JButton("Current Balance");
        JButton Deposit = new JButton("Deposit Money");*/

        login_page.add(Withdraw);
        login_page.add(Deposit);
        login_page.add(CurrentBal);

        WithdrawActionListener(ac, cno);
        DepositActionListener(ac, cno);
        CurrentBalActionListener(ac, cno);
    }

    //ActionListeners
    public void WithdrawActionListener(Account ac, String cno){
        Withdraw.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                //Withdraw screen opened
                WithDraw wd = new WithDraw(ac,cno);
                wd.setVisible(true);
                login_page.setVisible(false);

            }
        });
    }

    public void DepositActionListener(Account ac, String cno){
        Deposit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //JLabel txt = new JLabel("Clicked");
                Deposit dep = new Deposit(ac,cno);
                dep.setVisible(true);
                login_page.setVisible(false);

            }
        });
    }
    public void CurrentBalActionListener(Account ac, String cno){
        CurrentBal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                //Account ac = new Account();
                //String cno = Card_text.getText();
                //System.out.println(cno);
                JOptionPane.showMessageDialog(login_page,ac.setBalance(cno));
            }
        });
    }
}
