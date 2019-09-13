package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht2v3 extends Applet {

    int valerie,jeroen,hans;
    int Xas;
    int valerieFinal,jeroenFinal,hansFinal;


    public void init() {

        valerie = 100 * 2;
        jeroen = 80 * 2;
        hans = 40 * 2;

        Xas = 240;

        valerieFinal = Xas - valerie;
        jeroenFinal = Xas - jeroen;
        hansFinal = Xas - hans;
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
        g.fillRect(40,valerieFinal,50, valerie);
        g.setColor(Color.blue);
        g.fillRect(90,jeroenFinal,50,jeroen);
        g.setColor(Color.magenta);
        g.fillRect(140,hansFinal,50,hans);

        g.setColor(Color.black);
        g.drawLine(40,240,25,240);
        g.drawLine(40,200,25,200);
        g.drawLine(40,160,25,160);
        g.drawLine(40,120,25,120);
        g.drawLine(40,80,25,80);
        g.drawLine(40,40,25,40);
    }
}
