package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRoundRect(50,50,200,200,30,30);

        g.setColor(Color.black);
        g.fillOval(80,80,50,50);
        g.fillOval(170,80,50,50);
        g.fillOval(80,170,50,50 );
        g.fillOval(170,170,50,50);

    }
}
