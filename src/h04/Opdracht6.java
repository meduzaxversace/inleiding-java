package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.darkGray);

        g.drawRoundRect(20,20,90,250,5,5);
        g.setColor(Color.red);
        g.fillOval(30,30,70,70);
        g.setColor(Color.orange);
        g.fillOval(30,110,70,70);
        g.setColor(Color.green);
        g.fillOval(30,190,70,70);
        g.setColor(Color.black);
        g.drawRect(55,270,20, 120);

    }
}
