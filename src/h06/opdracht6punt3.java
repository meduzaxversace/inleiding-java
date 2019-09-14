package h06;
import java.awt.*;
import java.applet.*;

public class opdracht6punt3 extends Applet {
    int value1,value2,result;

    public void init() {
        value1 = 2147482711;
        value2 = 2147483241;
        result = value1 + value2;
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawString(value1 + " + " + value2 + " = " + result,20,20);
    }

}

