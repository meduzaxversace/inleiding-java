package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.black);
        g.drawRoundRect(40,30,5,150,5,5);
        g.fillRoundRect(40,30,5,150,5,5);

        g.setColor(Color.black);
        g.drawRect(45,40,100,20);
        g.setColor(Color.red);
        g.fillRect(45,40,100,20);

        g.setColor(Color.black);
        g.drawRect(45,60,100,20);
        g.setColor(Color.white);
        g.fillRect(45,60,100,20);

        g.setColor(Color.black);
        g.drawRect(45,80,100,20);
        g.setColor(Color.blue);
        g.fillRect(45,80,100,20);
    }
}
