package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht3van8 extends Applet {
    TextField textfield;
    double value;
    Button button1;
    double total;

    public void init(){
        textfield = new TextField("Price (Without BTW Included ");
        button1 = new Button("OK");
        button1.addActionListener(new ButtonListener());
        add(button1);
        add(textfield);
        total = 0;
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawString("Price(With BTW Included: " + total + "€",20,60);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            value = Double.valueOf(textfield.getText());
            total = value * 1.21;
            repaint();


        }
    }


}
