package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(50,10, 50, 260);
        g.drawLine(50, 260, 250, 260);

        g.drawString("0", 40, 260);
        g.drawString("20", 30, 210);
        g.drawString("40", 30, 160);
        g.drawString("60", 30, 110);
        g.drawString("80", 30, 60);
        g.drawString("100", 25, 15);

        g.drawString("Valerie", 55, 280);
        g.drawString("Jeroen", 105, 280);
        g.drawString("Hans", 160, 280);

        g.setColor(Color.blue);
        g.fillRect(50, 155, 50, 105);
        g.setColor(Color.magenta);
        g.fillRect(100, 10, 50, 250);
        g.setColor(Color.yellow);
        g.fillRect(150, 100, 50, 160);
    }
}
