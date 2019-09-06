package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRect(150, 150, 200, 200);

        g.drawLine(150,150, 225, 75);
        g.drawLine(300, 150, 225, 75);

        g.drawRect(180, 210, 25, 40);

        g.drawRect(120, 150, 75, 30);

        g.drawOval(165, 60, 20, 20);
    }
}
