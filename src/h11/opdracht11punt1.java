package h11;

import java.awt.*;
import java.applet.*;

public class opdracht11punt1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int i;
        int y = 0;

        for(i = 0; i < 10; i++) {
            y += 10;
            g.drawLine(10, y, 50, y);
        }
    }
}