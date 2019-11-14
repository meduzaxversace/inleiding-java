package h11;

import java.awt.*;
import java.applet.*;

public class opdracht11punt6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int i;

        int x = 80;
        int y = 80;
        int xWidth = 90;
        int yWidth = 90;

        for (i = 0; i < 5; i++) {

            g.drawOval(x, y, xWidth, yWidth);
            x += 10;
            y += 10;
            xWidth -= 20;
            yWidth -= 20;
        }
    }
}