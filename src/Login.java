import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
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
