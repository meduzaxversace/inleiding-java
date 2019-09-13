package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4TRAINING extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawArc(20,20,100,50,90,45);
        g.fillArc(20, 20 ,100, 50, 90, 45);
    }
}
