package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        g.drawString("Lijn",50,30);
        g.drawString("Rechthoek",40,100);
        g.drawString("Afgeronde rechthoek",10,170);
        g.drawString("Gevulde ovaal",150,170);
        g.drawString("Cirkel",300,170);
        g.drawString("Rechthoek met ovaal",140,100);
        g.drawString("Taarpunt met ovaal eromheen",280,100);

        g.setColor(Color.magenta);
        g.fillRect(140,40,110,40);
        g.fillOval(140,110,110,40);
        g.fillArc(270,40,110,40,0,45);

        g.setColor(Color.black);
        g.drawLine(10,10,120,10);
        g.drawRect(10,40,110,40);
        g.drawRoundRect(10,110,110,40,30,30);
        g.drawOval(140,40,110,40);
        g.drawOval(270,40,110,40);
        g.drawOval(300,110,40,40);
    }
}
