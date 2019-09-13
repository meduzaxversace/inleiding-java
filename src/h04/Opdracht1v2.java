package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht1v2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawLine(100,200,170,50);
        g.drawLine(230, 200, 170, 50);
        g.drawLine(100, 200, 230, 200);
    }

}
