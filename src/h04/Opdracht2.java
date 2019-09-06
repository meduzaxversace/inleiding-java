package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRect(100, 100, 150, 150);

        g.drawLine(100,100, 175, 25);
        g.drawLine(250, 100, 175, 25);

        g.drawRect(180, 210, 25, 40);

        g.drawRect(120, 150, 75, 30);

        g.drawOval(165, 60, 20, 20);
    }
}
