package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht1van8 extends Applet {
    TextField textfield;
    Button button1, button2;
    String s;

    public void init() {
        textfield = new TextField("Username:Password", 20);
        button1 = new Button("OK");
        button2 = new Button("Reset");
        button1.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener2());
        add(button1);
        add(button2);
        add(textfield);
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawString("Logins:" + s ,50,60);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = textfield.getText();

            repaint();

        }

    }

    class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textfield.setText("Username:Password");

        }

    }
}
