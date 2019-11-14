package h11;

import java.awt.*;
import java.applet.Applet;

public class opdracht11punt5 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int x = 10;
        int y = 10;
        int i;

        for (i = 0; i < 5; i++) {
            g.drawRect(x, y, 20, 20 );
            y += 20;
            x += 20;
        }
    }
}