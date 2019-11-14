package h11;

import java.awt.*;
import java.applet.*;

public class opdracht11punt7 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int x = 20;
        int y = 20;
        int xWidth = 550;
        int yWidth = 550;

        for (int i = 0; i < 55; i++) {

            g.drawOval(x, y, xWidth, yWidth);
            x += 5;
            y += 5;
            xWidth -= 10;
            yWidth -= 10;
        }
    }
}