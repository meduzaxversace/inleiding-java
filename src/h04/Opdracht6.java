package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.darkGray);

        g.drawRoundRect(60,120,5,100,5,5);
        g.drawRect();
    }
}
