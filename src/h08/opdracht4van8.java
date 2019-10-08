package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht4van8 extends Applet {

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    TextField textfield1;
    TextField textfield2;

    double value1;
    double value2;
    double result;

    public void init() {
        textfield1 = new TextField("",10);
        textfield2 = new TextField("",10);

        button1 = new Button("+");
        button1.addActionListener(new ButtonListener1());

        button2 = new Button("-");
        button2.addActionListener(new ButtonListener2());

        button3 = new Button("*");
        button3.addActionListener(new ButtonListener3());

        button4 = new Button("/");
        button4.addActionListener(new ButtonListener4());

        add(textfield1);
        add(textfield2);

        add(button1);
        add(button2);
        add(button3);
        add(button4);

    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawString("Answer: " + result,40,60);
    }

    class ButtonListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            value1 = Double.valueOf(textfield1.getText());
            value2 = Double.valueOf(textfield2.getText());
            result = value1 + value2;
            repaint();

        }
    }

    class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            value1 = Double.valueOf(textfield1.getText());
            value2 = Double.valueOf(textfield2.getText());
            result = value1 - value2;
            repaint();

        }
    }

    class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            value1 = Double.valueOf(textfield1.getText());
            value2 = Double.valueOf(textfield2.getText());
            result = value1 * value2;
            repaint();
        }
    }

    class ButtonListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            value1 = Double.valueOf(textfield1.getText());
            value2 = Double.valueOf(textfield2.getText());
            result = value1 / value2;
            repaint();
        }
    }

}
