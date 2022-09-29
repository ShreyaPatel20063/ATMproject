import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithDraw extends JFrame {

    //Variables for class
    JFrame withdraw_frame = new JFrame("Withdraw your Money");
    JButton wd_button = new JButton("Withdraw");

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

    }

    //Withdraw actionlistener
    public void dep_buttonActionListener(){
        wd_button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JLabel txt = new JLabel();
//********************************************************************************************************
                //lg.setVisible(true);
                //dep_button.setVisible(false);

            }
        });
    }
}
