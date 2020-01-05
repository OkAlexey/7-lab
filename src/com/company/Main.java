package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

class Main {

    public static void main(String[] args) {

        JFrame jam = new JFrame("An Event Example");

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
                int x = getRandomNumberInRange(0, 1920 - 100);
                int y = getRandomNumberInRange(0, 1080 - 50);
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
