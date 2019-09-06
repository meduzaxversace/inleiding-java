package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(150, 250, 250, 100);
        g.drawLine(350, 250, 250,100);
        g.drawLine(150, 250, 350, 250);
    }
}
