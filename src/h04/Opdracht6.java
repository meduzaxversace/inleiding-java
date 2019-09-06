package h04;

import java.awt.*;
import java.applet.*;


public class Opdracht6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(150,20,40, 100);

        g.fillRect(168,110, 5, 100);

        g.setColor(Color.red);
        g.fillOval(158,25,24,24);

        g.setColor(Color.orange);
        g.fillOval(158, 57,24,24);

        g.setColor(Color.green);
        g.fillOval(158,90,24,24);

    }
}
