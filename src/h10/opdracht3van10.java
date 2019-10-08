package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht3van10 extends Applet {

    int monthdays;
    int month;
    String month2;
    int year;

    TextField textField;
    Button Enter;
    TextField textField2;

    public void init() {

        monthdays = 0;
        month2 = "";
        year = 0;
        textField = new TextField("",15);
        textField2 = new TextField("",15);
        Enter = new Button("Enter");
        Enter.addActionListener(new EnterButtonListener());

        add(textField);
        add(textField2);
        add(Enter);
    }

    public void paint(Graphics g) {

        g.drawString("Months name is: " + month2, 40, 50);
        g.drawString("This month has " + monthdays + " days", 40, 65);
        g.drawString("The year is: " + year, 40, 80);


    }

        class EnterButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e){

                month = Integer.valueOf(textField.getText());
                year = Integer.valueOf(textField2.getText());

                switch (month) {
                    case 1:
                        month2 = "January";
                        monthdays = 31;
                        break;

                    case 2:
                        month2 = "February";
                        if ( (year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0 ) {
                            monthdays = 29;
                        }
                        else {
                            monthdays = 28;
                        }
                        break;

                        case 3:
                        month2 = "March";
                        monthdays = 31;
                        break;

                    case 4:
                        month2 = "April";
                        monthdays = 30;
                        break;

                    case 5:
                        month2 = "May";
                        monthdays = 31;
                        break;

                    case 6:
                        month2 = "June";
                        monthdays = 30;
                        break;

                    case 7:
                        month2 = "July";
                        monthdays = 31;
                        break;

                    case 8:
                        month2 = "August";
                        monthdays = 31;
                        break;

                    case 9:
                        month2 = "September";
                        monthdays = 30;
                        break;

                    case 10:
                        month2 = "October";
                        monthdays = 31;
                        break;

                    case 11:
                        month2 = "November";
                        monthdays = 30;
                        break;

                    case 12:
                        month2 = "December";
                        monthdays = 31;
                        break;

                    default:
                        month2 = "Invalid number";
                        monthdays = 0;
                        break;
                }
                        repaint();
                }
            }
        }