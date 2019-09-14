package h06;
import java.awt.*;
import java.applet.*;

public class opdracht6punt1 extends Applet {
    double totalAmount, finalAmount;

    public void init() {
        totalAmount = 113;
        finalAmount = totalAmount / 4;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawString("Jan" + " €" + finalAmount,20,20);
        g.drawString("Ali" + " €" + finalAmount,20,35);
        g.drawString("Jeannette" + " €" + finalAmount,20,50);
        g.drawString("Kevin" + " €" + finalAmount,20,65);
    }

}
