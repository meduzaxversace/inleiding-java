package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(40,40,150,200);

        g.drawString("Valerie", 45,255 );
        g.drawString("Jeroen", 95,255 );
        g.drawString("Hans", 145,255 );
        g.drawString("0",28,238);
        g.drawString("20",23,198);
        g.drawString("40",23,158);
        g.drawString("60",23,118);
        g.drawString("80",23,78);
        g.drawString("100",21,38);

        g.setColor(Color.pink);
        g.fillRect(40,160,50,80);
        g.drawRect(40,160,50,80);
        g.setColor(Color.blue);
        g.fillRect(90,40,50,200);
        g.drawRect(90,40,50,200);
        g.setColor(Color.magenta);
        g.fillRect(140,80,50,160);
        g.drawRect(140,80,50,160);

        g.setColor(Color.black);
        g.drawLine(40,240,25,240);
        g.drawLine(40,200,25,200);
        g.drawLine(40,160,25,160);
        g.drawLine(40,120,25,120);
        g.drawLine(40,80,25,80);
        g.drawLine(40,40,25,40);
    }
}
