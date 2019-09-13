package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawRect(40,80,140,150);

        g.drawRect(125,180,20,50);
        g.drawOval(70,120, 30,30);

        g.drawLine(40,80,110,30);
        g.drawLine(110,30,180,80);
    }
}
