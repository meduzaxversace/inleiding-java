package h12;

import java.awt.*;
import java.applet.*;

public class opdracht12punt1 extends Applet {

    double[] myArray = {12, 152, 17, 35, 294, 47, 56, 59, 31};
    double result;

    public void init() {

    }


    public void paint(Graphics g) {

        int i;
        int y = 20;
        double total = 0;

        for (i = 0; i < myArray.length; i++) {
            g.drawString(myArray[i] + "", 20, y);
            y += 20;
        }

        for (i = 0; i < myArray.length; i++) {
            total = total + myArray[i];
        }

        result = total / myArray.length;

        g.drawString("The average is: " + result, 100, 20);
    }
}