package h11;

import java.awt.*;
import java.applet.*;

public class opdracht11punt8 extends Applet {

    int width;
    int height;

    public void init() {

        width = 20;
        height = 20;

    }

    public void paint(Graphics g) {

        int i;

        for (i = 0; i < 105; i++) {
            g.drawOval(20, 20, width, height );
            width += 5;
            height += 5;
        }
    }
}