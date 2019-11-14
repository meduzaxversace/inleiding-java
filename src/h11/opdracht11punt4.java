package h11;

import java.awt.*;
import java.applet.*;


public class opdracht11punt4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int i;
        int result;
        int y = 20;

        for (i = 0; i < 10; i++) {

            result = 3 * (i + 1);
            g.drawString(result + "", 20, y);
            y +=20;
        }
    }
}