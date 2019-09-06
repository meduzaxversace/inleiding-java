package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRect(40, 20, 10, 250);

        g.setColor(Color.red);
        g.fillRect(50, 35, 150, 30);

        g.setColor(Color.white);
        g.fillRect(50, 65, 150, 30);

        g.setColor(Color.blue);
        g.fillRect(50, 95, 150, 30);
    }
}
