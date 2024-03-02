package com.rgbteam.view;

import com.rgbteam.Controller;
import com.rgbteam.chemistry.Element;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewTable {
    private JButton[] buttons;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private final Controller controller = new Controller();

    public NewTable() {
        initializeElementButtonsAndTheirListeners();
        initializeFrame();
    }

    private void initializeElementButtonsAndTheirListeners() {
        label1 = new JLabel("57 - 71");
        label2 = new JLabel("89 - 103");
        label3 = new JLabel("Lanthanide");
        label4 = new JLabel("Actinide");
        buttons = new JButton[118];

        var elementButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton source = (JButton) actionEvent.getSource();
                String shortName = source.getText();
                var e = controller.retrieveElementByShortName(shortName);
                JOptionPane.showMessageDialog(null, e, "Element", JOptionPane.INFORMATION_MESSAGE);
            }
        };

        for (int i = 0; i < 118; i++) {
            Element e = controller.retrieveElementByNumber(i + 1);
            if (e != null) {
                buttons[i] = new JButton(e.getShortName());
                buttons[i].addActionListener(elementButtonListener);
            }
        }
    }

    private void initializeFrame() {
        JPanel panel = tablePanelSetup();
        JFrame frame = new JFrame("Periodic Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JPanel tablePanelSetup() {
        int i = 0;
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 18, 10, 10));

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 18; col++) {
                if ((row == 0 && col < 17 && col > 0) || (row == 1 && col < 12 && col > 1) || (row == 2 && col < 12 && col > 1) || (row == 7) || (row == 8 && col < 2) || (row == 9 && col < 2)) {
                    panel.add(Box.createRigidArea(new Dimension(10, 10)));
                } else if ((row == 5 && col == 2)) {
                    panel.add(label1);
                    i += 15;
                } else if ((row == 6 && col == 2)) {
                    panel.add(label2);
                    i += 15;
                } else if (row == 8 && col == 2) {
                    panel.add(label3);
                    i -= 62;
                } else if (row == 9 && col == 2) {
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
        return panel;
    }
}
