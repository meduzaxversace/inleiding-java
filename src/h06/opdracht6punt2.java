package h06;
import java.awt.*;
import java.applet.*;

public class opdracht6punt2 extends Applet {
    double seconds, minutes, hours, days, years, leap;

    public void init() {
        seconds = 1;
        minutes = seconds * 60;
        hours = minutes * 60;
        days = hours * 24;
        years = days * 365;
        leap = days * 366;


    }


    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawString("In 1 minute goes " + minutes + " seconds",40,40);
        g.drawString("In 1 hour goes " + hours + " seconds",40,60);
        g.drawString("In 1 day goes " + days + " seconds",40,80);
        g.drawString("In 1 year goes " + years + " seconds",40,100);
        g.drawString("In 1 leap year goes " + leap + " seconds",40,120);

    }
}
