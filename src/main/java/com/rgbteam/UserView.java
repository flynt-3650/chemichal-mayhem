package com.rgbteam;

import javax.swing.*;
import com.rgbteam.chemistry.Compound;
import com.rgbteam.chemistry.PeriodicTable;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UserView extends JFrame {

    private JTextField elementInfo = new JTextField();
    JPanel buttons = new JPanel(new GridLayout(18, 18, 5, 5));

    UserView(){
        super("chemistry table");
    }

    
    public void init(){
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addButtons(PeriodicTable.Element[] TABLE_LIST){

        for (PeriodicTable.Element el : TABLE_LIST){
            JButton elementButton = new JButton(el.getShortName());
            if(el.isMetal()){
                elementButton.setBackground(Color.yellow);
            }else{
                elementButton.setBackground(Color.green);
            }
            elementButton.setPreferredSize(new Dimension(40, 40));
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
            buttons.add(elementButton);
        }
    }
}
