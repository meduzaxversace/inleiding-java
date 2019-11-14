package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
;

public class opdracht11punt10 extends Applet {

    int multiplier;
    int number;
    int result;

    Button Enter;

    public void init() {

        Enter = new Button("Enter");
        Enter.addActionListener(new EnterButtonListener());

        add(Enter);

        multiplier = 1;

    }

    public void paint(Graphics g) {

        int i;
        int y = 50;

        for (i = 0; i < 10; i++) {

            result = number * multiplier;
            g.drawString(number + " x " + multiplier + " = " + result, 20, y);
            multiplier++;
            y +=20;
        }

    }

    class EnterButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            multiplier = 1;
            number++;
            if (number > 10) {
                number = 1;
            }
            repaint();
        }
    }
}