package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht8punt1 extends Applet {
    Button button;
    TextField textfield;
    Label label;
    String screentext;
    String s;


    public void init() {
        button = new Button();
        textfield = new TextField("Click on me",20);
        screentext = "Does this button do anything at all?'";
        label = new Label("Type something in the textfield");
        button.setLabel("Click on me");
        ButtonListener kl = new ButtonListener();
        button.addActionListener( kl );
        add(label);
        add(button);
        s = "";
        add(textfield);

    }



    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawString(screentext, 50, 60);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed ( ActionEvent e) {
            screentext = "Yes it sure does";
            s = textfield.getText();
            repaint();
        }

    }
}
