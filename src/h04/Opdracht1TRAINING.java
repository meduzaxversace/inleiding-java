package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht1TRAINING extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawRect(20,20,100,150);
        g.fillRect(20, 80, 100, 50);
    }
}
