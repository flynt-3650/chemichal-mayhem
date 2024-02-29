package com.rgbteam.view;

import javax.swing.*;
import java.awt.*;

public class NewTable {

    private JPanel panel;
    private JButton[] buttons;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;

    public NewTable() {
        initialize();
        frameSettings();

    }

    public void initialize() {
        label1 = new JLabel("57 - 71");
        label2 = new JLabel("89 - 103");
        label3 = new JLabel("Lanthanide");
        label4 = new JLabel("Actinide");
        buttons = new JButton[118];
        for (int i = 0; i < 118; i++) {
            buttons[i] = new JButton("el" + (i + 1));
        }
    }

    public void frameSettings() {
        int i = 0;
        panel = new JPanel();
        panel.setLayout(new GridLayout(9, 18, 10, 10));

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 18; col++) {
                if ((row == 0 && col < 17 && col > 0) || (row == 1 && col < 12 && col > 1) || (row == 2 && col < 12 && col > 1) || (row == 7 && col < 2) || (row == 8 && col < 2)) {
                    panel.add(Box.createRigidArea(new Dimension(10, 10)));
                } else if ((row == 5 && col == 2)) {
                    panel.add(label1);
                    i += 15;
                } else if ((row == 6 && col == 2)) {
                    panel.add(label2);
                    i += 15;
                } else if (row == 7 && col == 2) {
                    panel.add(label3);
                    i -= 62;
                } else if (row == 8 && col == 2) {
                    panel.add(label4);
                    i += 17;
                } else {
                    if (i == 118) {
                        break;
                    }
                    panel.add(buttons[i]);
                    i++;

                }
            }
        }

        JFrame frame = new JFrame("Periodic Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }


}

