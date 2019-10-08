package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht1van10 extends Applet {
    int highestnumber;
    int number;

    TextField textField;
    Button Enter;

    public void init() {
        highestnumber = 0;
        number = 0;

        textField = new TextField("",15);
        Enter = new Button("Enter");
        Enter.addActionListener(new EnterButtonListener());

        add(textField);
        add(Enter);

    }

    public void paint(Graphics g) {

        g.drawString("Highest number this far: " + highestnumber,40,50);

    }

    class EnterButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            number = Integer.valueOf(textField.getText());

            if (number > highestnumber) {
                highestnumber = number;
                textField.setText("");
                repaint();
            }
        }
    }
}

