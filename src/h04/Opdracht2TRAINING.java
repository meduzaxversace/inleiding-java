package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht2TRAINING extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawRoundRect(20,20,100,50,10,10);
        g.fillRoundRect(20, 20, 100, 50, 10 , 10);
    }
}