package h04;

import java.awt.*;
import java.applet.*;

public class Practice extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

    g.drawLine(10,20,210,20);
    g.drawString("Lijn", 100, 35);

    g.drawRect(10, 40, 200, 100);
    g.drawString("Rechthoek",80,155 );

    g.drawRoundRect(10,160, 200, 100, 30, 30);
    g.drawString("Afgeronde rechthoek", 55, 275);

    g.setColor(Color.magenta);
    g.fillRect(220, 40, 200, 100);

    g.setColor(Color.black);
    g.drawOval(220, 40, 200, 100);

    g.drawString("Gevulde rechthoek met ovaal", 240, 155);

    g.setColor(Color.magenta);
    g.fillOval(220, 160, 200, 100);

    g.setColor(Color.black);
    g.drawString("Gevulde ovaal", 280, 275);

    g.drawOval(430,40,200,100);

    g.setColor(Color.magenta);
    g.fillArc(430,40,200,100,0,45);

    g.setColor(Color.black);
    g.drawString("Taartpunt met ovaal eromheen", 450, 155);

    g.drawOval(480,170,100,100);
    g.drawString("Cirkel", 515, 285);



    }
}
