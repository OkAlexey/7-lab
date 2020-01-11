package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

class Main {

    public static void main(String[] args) {

        JFrame jam = new JFrame("An Event Example");
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Insets scnMax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
            int taskBarSize = scn.Max.bottom;
            int width = screenSize.width;
            int height = screenSize.height;

            jam.setLayout(new FlowLayout());
            jam.setSize(300, 200);
            jam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton janDVD = new JButton("DVD");

            jam.add(janDVD);
            jam.setVisible(true);
            janDVD.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int x = getRandomNumberInRange(0, width - 100);
                int y = getRandomNumberInRange(0, height - 50);
                janDVD.setBounds(x, y, 100, 50);
            }

                private int getRandomNumberInRange(int i, int i1) {
                if (i >= i1) {
                    throw new IllegalArgumentException(("max must be greater than min"));
                }
                    Random r = new Random();
                    return r.nextInt((i1 - i) + 1) + i;
                }
            });
    }
}
