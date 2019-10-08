package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class opdracht6van10 extends Applet {

    TextField grade1;
    Button Enter;

    Double grade;
    String result;

    public void init() {

        grade1 = new TextField("", 5);

        Enter = new Button("Enter");
        Enter.addActionListener(new EnterButtonListener());

        add(grade1);
        add(Enter);

        grade = 0.0;
        result = "";


    }

    public void paint(Graphics g) {

        g.drawString("Result: " + result, 50, 50);

    }

    class EnterButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            grade = Double.valueOf(grade1.getText());

            if (grade >= 1 && grade <= 3.9) {
                result = "Bad";
            }

            else if (grade > 3.9 && grade <= 4.9) {
                result = "Not good";
            }

            else if (grade > 4.9 && grade <= 5.9) {
                result = "Mild";
            }

            else if (grade > 5.9 && grade <= 7.9) {
                result = "Good";
            }

            else if (grade > 7.9 && grade <= 10) {
                result = "Well Done";
            }

            else {
                result = "Invalid grade";
            }

            repaint();
        }
    }
}