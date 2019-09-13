package h02;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    public void init() {
        setBackground(Color.darkGray);

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("Kevin", 50, 60);
        g.drawString("Liivak", 50, 80);
    }
}