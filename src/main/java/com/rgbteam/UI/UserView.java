package com.rgbteam.UI;

import javax.swing.*;
import com.rgbteam.chemistry.*;
import java.awt.*;
import java.awt.event.*;

class UserView extends PeriodicTable {

    private final JTextField elementInfo = new JTextField();
    private final JPanel buttonsPanel = new JPanel(new GridLayout(10, 18, 8, 8));

    UserView(){
        init();
        addButtons();
    }

    public void init(){
        buttonsPanel.setBackground(Color.black);
        getContentPane().add(elementInfo, BorderLayout.EAST);
        setSize(1000, 1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addButtons(){

        PeriodicTable.Element[] TABLE_LIST = getTableList();

        for (PeriodicTable.Element el : TABLE_LIST){
            JButton elementButton = new JButton(el.getShortName());
            if(el.isMetal()){
                elementButton.setBackground(Color.yellow);
            } else {
                elementButton.setBackground(Color.green);
            }
            elementButton.setSize(10, 10);
            elementButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    /*
                    сделать отчистку текстовой инфо сбоку
                    сделать обновление информации об элементе (металл, не металл , атомная масса, валентность, полное название)
                    JButton clickedButton = (JButton) ae.getSource();
                    String buttonText = clickedButton.getText();
                    (идеи, что ещё можено реализовать)
                    url вики
                     */
                }
            });
            buttonsPanel.add(elementButton);
        }
        getContentPane().add(buttonsPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UserView::new);
    }
}
