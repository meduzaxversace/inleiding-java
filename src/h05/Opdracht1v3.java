package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht1v3 extends Applet {

    Color fillcolor;
    Color linecolor;
    int width;
    int height;

    public void init() {

        fillcolor = Color.lightGray;
        linecolor = Color.darkGray;
        width = 110;
        height = 40;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        g.drawString("Lijn", 50, 30);
        g.drawString("Rechthoek", 40, 100);
        g.drawString("Afgeronde rechthoek", 10, 170);
        g.drawString("Gevulde ovaal", 150, 170);
        g.drawString("Cirkel", 300, 170);
        g.drawString("Rechthoek met ovaal", 140, 100);
        g.drawString("Taarpunt met ovaal eromheen", 280, 100);

        g.setColor(fillcolor);
        g.fillRect(140, 40, width, height);
        g.fillOval(140, 110, width, height);
        g.fillArc(270, 40, width, height, 0, 45);

        g.setColor(linecolor);
        g.drawLine(10, 10, 120, 10);
        g.drawRect(10, 40, width, height);
        g.drawRoundRect(10, 110, width, height, 30, 30);
        g.drawOval(140, 40, width, height);
        g.drawOval(270, 40, width, height);
        g.drawOval(300, 110, width, height);

    }
}
