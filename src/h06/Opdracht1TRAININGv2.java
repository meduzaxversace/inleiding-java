package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht1TRAININGv2 extends Applet {

    int a;
    int b;
    int c;
    int result;

    public void init() {

    a = 25;
    b = 105;
    c = 7;
    result = (a + b) / c;

    }

    public void paint(Graphics g) {
        g.drawString("The result is:" + result, 40, 40);
    }
}
