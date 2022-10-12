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

        login_page.setVisible(true);
        login_page.setLayout(new FlowLayout());
        login_page.setDefaultCloseOperation(EXIT_ON_CLOSE);
        login_page.setBounds(350, 350, 250, 250);

        login_page.add(Withdraw);
        login_page.add(Deposit);
        login_page.add(CurrentBal);

        WithdrawActionListener(ac, cno);
        DepositActionListener(ac, cno);
        CurrentBalActionListener(ac, cno);
    }

    /** Withdraw button opens WithDraw class's JFrame*/
    public void WithdrawActionListener(Account ac, String cno){
        Withdraw.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                WithDraw wd = new WithDraw(ac,cno);
                wd.setVisible(true);
                login_page.setVisible(false);

            }
        });
    }

    /** Deposit button opens Deposit class's JFrame*/
    public void DepositActionListener(Account ac, String cno){
        Deposit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Deposit dep = new Deposit(ac,cno);
                dep.setVisible(true);
                login_page.setVisible(false);

            }
        });
    }

    /** current balance shows the balance of the user saved in balance Double[]*/
    public void CurrentBalActionListener(Account ac, String cno){
        CurrentBal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(login_page,ac.setBalance(cno));
            }
        });
    }
}
