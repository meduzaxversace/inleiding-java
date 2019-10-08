package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht2van10 extends Applet {
    int highestnumber;
    int number;
    int lowestnumber;


    TextField textField;
    Button Enter;

    public void init() {
        highestnumber = 0;
        number = 0;
        lowestnumber = 0;

        textField = new TextField("",15);
        Enter = new Button("Enter");
        Enter.addActionListener(new EnterButtonListener());

        add(textField);
        add(Enter);

    }

    public void paint(Graphics g) {

        g.drawString("Highest number this far: " + highestnumber,40,50);
        g.drawString("Lowest number this far: " + lowestnumber,40,65);

    }

    class EnterButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            number = Integer.valueOf(textField.getText());


            if (highestnumber == 0) {
                lowestnumber = number;
            }
            else if (number < lowestnumber) {
                lowestnumber = number;
            }
            if (number > highestnumber) {
                highestnumber = number;
            }


            textField.setText("");
                repaint();
        }
    }
}

