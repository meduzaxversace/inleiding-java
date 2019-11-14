package h11;

import java.awt.*;
import java.applet.*;

public class opdracht11punt2 extends Applet {

    int number;

    public void init() {

        number = 21;

    }

    public void paint(Graphics g) {
        int i;
        int y = 0;

        for (i = 0; i <= 10; i++) {
            number -= 1;
            y += 15;
            g.drawString("" + number, 10, y );
        }
    }
}