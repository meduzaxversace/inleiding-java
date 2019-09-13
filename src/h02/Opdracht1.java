package h02;

import java.awt.*;
import java.applet.*;

    public class Opdracht1 extends Applet {

        public void init() {
            setBackground(Color.magenta);

        }

        public void paint(Graphics g) {
            g.setColor(Color.yellow);
            g.drawString("Welcome to Medusa!", 50, 60);
        }
    }