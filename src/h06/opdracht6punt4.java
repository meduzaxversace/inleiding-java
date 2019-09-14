package h06;
import java.awt.*;
import java.applet.*;

public class opdracht6punt4 extends Applet {
    double grade1;
    double grade2;
    double grade3;

    double grades;

    double averageUnrounded;
    double averageTimesTen;
    int averageInt;
    double average;

    public void init() {

        grade1 = 5.9;
        grade2 = 6.3;
        grade3 = 6.9;

        grades = grade1 + grade2 + grade3;

        averageUnrounded = grades / 3;
        averageTimesTen = averageUnrounded * 10;
        averageInt = (int) averageTimesTen;
        average = (double) averageInt / 10;

    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawString("(5.9 + 6.3 + 6.9) / 3 = " + average, 20, 20);

    }
}