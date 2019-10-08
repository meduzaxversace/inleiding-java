package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht2van8 extends Applet {

    int men;
    int women;
    int boys;
    int girls;

    Button buttonmen;
    Button buttonwomen;
    Button buttonboys;
    Button buttongirls;

    Button buttonReset;

    int total;


    public void init(){

        buttonmen = new Button("Men");
        buttonmen.addActionListener(new MenButtonListener());
        buttonwomen = new Button("Women");
        buttonwomen.addActionListener(new WomenButtonListener());
        buttonboys = new Button("Boys");
        buttonboys.addActionListener(new BoysButtonListener());
        buttongirls = new Button("Girls");
        buttongirls.addActionListener(new GirlsButtonListener());

        buttonReset = new Button("Reset");
        buttonReset.addActionListener(new ResetButtonListener());

        add(buttonmen);
        add(buttonwomen);
        add(buttonboys);
        add(buttongirls);
        add(buttonReset);

        men = 0;
        women = 0;
        boys = 0;
        girls = 0;
        total = 0;
    }

    public void paint(Graphics g) {
        g.drawString("Men: " + men, 150, 90);
        g.drawString("Women: " + women, 150 , 110);
        g.drawString("Boys: " + boys, 150, 130);
        g.drawString("Girls: " + girls, 150, 150);
        g.drawString("Total: " + total, 150, 170);

    }

    class MenButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            men++;
            total = men + women + boys + girls;
            repaint();
        }
    }

    class WomenButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            women++;
            total = men + women + boys + girls;
            repaint();
        }
    }

    class BoysButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            boys++;
            total = men + women + boys + girls;
            repaint();
        }
    }

    class GirlsButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            girls++;
            total = men + women + boys + girls;
            repaint();
        }
    }

    class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            men = 0;
            women = 0;
            boys = 0;
            girls = 0;
            total = men + women + boys + girls;
            repaint();
        }
    }
}