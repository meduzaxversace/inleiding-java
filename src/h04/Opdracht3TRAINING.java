package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht3TRAINING extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawOval(20, 20, 100 ,100);
        g.fillOval(20,20,100,100);
    }

}
