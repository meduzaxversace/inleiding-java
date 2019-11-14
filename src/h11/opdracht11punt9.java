package h11;

import java.awt.*;
import java.applet.*;

public class opdracht11punt9 extends Applet {

    int width;
    int height;

    public void init() {

        setBackground(Color.gray);
        width = 30;
        height = 30;
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int column;
        int rows;

        for (rows = 0; rows < 8; rows++) {


            for (column = 0; column < 8; column++) {

                if (rows == 0 || rows == 2 || rows == 4 || rows == 6) {

                    if (column == 0 || column == 2 || column == 4 || column == 6) {
                        g.setColor(Color.black);
                        g.fillRect(x, y, width, height);
                    }
                    else {
                        g.setColor(Color.white);
                        g.fillRect(x, y, width, height);
                    }
                    x += width;

                }
                else {
                    if (column == 0 || column == 2 || column == 4 || column == 6) {
                        g.setColor(Color.white);
                        g.fillRect(x, y, width, height);
                    }
                    else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, width, height);
                    }
                    x += width;
                }

            }
            y += height;
            x = 50;
        }
    }
}