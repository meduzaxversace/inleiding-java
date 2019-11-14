package h11;

import java.awt.*;
import java.applet.*;

public class opdracht11punt3 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int i;
        int y = 20;
        int number1 = 0;
        int number2 = 1;
        int number3 = 1;

        for (i = 0; i < 20; i++) {
            g.drawString("" + number1, 20, y);

            number1 = number2;
            number2 = number3;
            number3 = number1 + number2;
            y += 20;
        }
    }
}