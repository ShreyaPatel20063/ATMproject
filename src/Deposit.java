import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends JFrame {

    JFrame deposit_frame = new JFrame("Deposit your Money");
    JTextField deposit_money = new JTextField("Enter Amount");
    JButton dep_button = new JButton("Deposit");

    Deposit() {
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
    }

    //action listeners
    public void dep_buttonActionListener(){
        dep_button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JLabel txt = new JLabel();

                //lg.setVisible(true);
                dep_button.setVisible(false);

            }
        });
    }
}
