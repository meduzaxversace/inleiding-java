package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht5van10 extends Applet {

    TextField grade1text;
    TextField grade2text;
    TextField grade3text;

    Button Enter;

    double grade1;
    double grade2;
    double grade3;
    double average;
    double average1;
    double average2;

    int average3;

    String result;

    public void init() {

        grade1text = new TextField("", 10);
        grade2text = new TextField("", 10);
        grade3text = new TextField("", 10);

        Enter = new Button("Enter");
        Enter.addActionListener(new EnterButtonListener());

        add(grade1text);
        add(grade2text);
        add(grade3text);
        add(Enter);

        grade1 = 0;
        grade2 = 0;
        grade3 = 0;
        result = "";

    }

    public void paint(Graphics g) {

        g.drawString("Average is: " + average,40,65);
        g.drawString("You have: " + result,40,80);

    }

    class EnterButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            grade1 = Double.valueOf(grade1text.getText());
            grade2 = Double.valueOf(grade2text.getText());
            grade3 = Double.valueOf(grade3text.getText());

            average1 = (grade1 + grade2 + grade3)/3;


            average2 = average1 * 10;
            average3 = (int) average2;
            average = (double) average3 / 10;

            if (average >= 5.5) {
                result = "Passed";
            }

            else {
                result = "Failed";
            }
            repaint();

        }
    }
}