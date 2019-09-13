package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);

        g.drawArc(40,40,200,150,400, 400);
        g.fillArc(40,40,200,150,400,400);
    }
}
