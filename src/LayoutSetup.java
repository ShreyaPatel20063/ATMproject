import javax.swing.*;
import java.awt.*;

public class LayoutSetup {
        LayoutSetup() {
            JFrame frame = new JFrame("Frame");
            frame.setVisible(true);
            frame.setBounds(50, 50, 500, 500);
            JPanel pane = new JPanel(new GridBagLayout());
            GridBagConstraints c;
            c = new GridBagConstraints();
            JButton button;
            pane.setLayout(new GridBagLayout());
            c = new GridBagConstraints();
            c.fill = GridBagConstraints.HORIZONTAL;

            button = new JButton("Button 1");
            c.weightx = 0.5;
            c.gridx = 0;
            c.gridy = 0;
            pane.add(button, c);

            button = new JButton("Button 2");
            c.gridx = 1;
            c.gridy = 0;
            pane.add(button, c);

            button = new JButton("Button 3");
            c.gridx = 2;
            c.gridy = 0;
            pane.add(button, c);

            button = new JButton("Long-Named Button 4");
            c.ipady = 40;      //make this component tall
            c.weightx = 0.0;
            c.gridwidth = 3;
            c.gridx = 0;
            c.gridy = 1;
            pane.add(button, c);

            button = new JButton("5");
            c.ipady = 0;       //reset to default
            c.weighty = 1.0;   //request any extra vertical space
            c.anchor = GridBagConstraints.PAGE_END; //bottom of space
            c.insets = new Insets(10, 0, 0, 0);  //top padding
            c.gridx = 1;       //aligned with button 2
            c.gridwidth = 2;   //2 columns wide
            c.gridy = 2;       //third row
            pane.add(button, c);
        }

}


