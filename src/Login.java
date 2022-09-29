import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

    JFrame login_page = new JFrame("Edit Money");
    JButton Withdraw = new JButton("Withdraw Money");
    JButton CurrentBal = new JButton("Current Balance");
    JButton Deposit = new JButton("Deposit Money");

    public Login() {
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

        WithdrawActionListener();
        DepositActionListener();
        CurrentBalActionListener();
    }

    //ActionListeners
    public void WithdrawActionListener(){
        Withdraw.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                //Withdraw screen opened
                WithDraw wd = new WithDraw();
                wd.setVisible(true);
                login_page.setVisible(false);

            }
        });
    }
    public void CurrentBalActionListener(){
        CurrentBal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                //nbh

            }
        });
    }
    public void DepositActionListener(){
        Deposit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //JLabel txt = new JLabel("Clicked");
                Deposit dep = new Deposit();
                dep.setVisible(true);
                login_page.setVisible(false);

            }
        });
    }
}
