package com.rgbteam.view;

import javax.swing.*;


public class ObsoleteGUIView {
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button29;
    private JButton button30;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JButton button35;
    private JButton button36;
    private JButton button37;
    private JButton button38;
    private JButton button39;
    private JButton button40;
    private JButton button41;
    private JButton button42;
    private JButton button43;
    private JButton button44;
    private JButton button45;
    private JButton button46;
    private JButton button47;
    private JButton button48;
    private JButton button49;
    private JButton button50;
    private JButton button51;
    private JButton button52;
    private JButton button53;
    private JButton button54;
    private JButton button55;
    private JButton button56;
    private JButton button57;
    private JButton button58;
    private JButton button59;
    private JButton button60;
    private JButton button61;
    private JButton button62;
    private JButton button63;
    private JButton button64;
    private JButton button65;
    private JButton button66;
    private JButton button67;
    private JButton button68;
    private JButton button69;
    private JButton button70;
    private JButton button71;
    private JButton button72;
    private JButton button73;
    private JButton button74;
    private JButton button75;
    private JButton button76;
    private JButton button77;
    private JButton button78;
    private JButton button79;
    private JButton button80;
    private JButton button81;
    private JButton button82;
    private JButton button83;
    private JButton button84;
    private JButton button85;
    private JButton button86;
    private JButton button87;
    private JButton button88;
    private JButton button89;
    private JButton button90;
    private JButton button91;
    private JButton button92;
    private JButton button93;
    private JButton button94;
    private JButton button95;
    private JButton button96;
    private JButton button97;
    private JButton button98;
    private JButton button99;
    private JButton button100;
    private JButton button101;
    private JButton button102;
    private JButton button103;
    private JButton button104;
    private JButton button105;
    private JButton button106;
    private JButton button107;
    private JButton button108;
    private JButton button109;
    private JButton button110;
    private JButton button111;
    private JButton button112;
    private JButton button113;
    private JButton button114;
    private JButton button115;
    private JButton button116;
    private JButton button117;
    private JButton button118;

    public ObsoleteGUIView() {
        frameSettings();
        initializeButtons();
    }

    public void frameSettings() {
        JFrame frame = new JFrame("Periodic Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(this.panel1);
        frame.pack();
        frame.setVisible(true);
    }


    private void initializeButtons() {
        for (int i = 1; i <= 118; i++) {
            JButton button = getButton(i);
            assert button != null;
            button.setText("el" + " " + i);
        }
    }

    private JButton getButton(int index) {
        return switch (index) {
            case 1 -> button1;
            case 2 -> button2;
            case 3 -> button3;
            case 4 -> button4;
            case 5 -> button5;
            case 6 -> button6;
            case 7 -> button7;
            case 8 -> button8;
            case 9 -> button9;
            case 10 -> button10;
            case 11 -> button11;
            case 12 -> button12;
            case 13 -> button13;
            case 14 -> button14;
            case 15 -> button15;
            case 16 -> button16;
            case 17 -> button17;
            case 18 -> button18;
            case 19 -> button19;
            case 20 -> button20;
            case 21 -> button21;
            case 22 -> button22;
            case 23 -> button23;
            case 24 -> button24;
            case 25 -> button25;
            case 26 -> button26;
            case 27 -> button27;
            case 28 -> button28;
            case 29 -> button29;
            case 30 -> button30;
            case 31 -> button31;
            case 32 -> button32;
            case 33 -> button33;
            case 34 -> button34;
            case 35 -> button35;
            case 36 -> button36;
            case 37 -> button37;
            case 38 -> button38;
            case 39 -> button39;
            case 40 -> button40;
            case 41 -> button41;
            case 42 -> button42;
            case 43 -> button43;
            case 44 -> button44;
            case 45 -> button45;
            case 46 -> button46;
            case 47 -> button47;
            case 48 -> button48;
            case 49 -> button49;
            case 50 -> button50;
            case 51 -> button51;
            case 52 -> button52;
            case 53 -> button53;
            case 54 -> button54;
            case 55 -> button55;
            case 56 -> button56;
            case 57 -> button57;
            case 58 -> button58;
            case 59 -> button59;
            case 60 -> button60;
            case 61 -> button61;
            case 62 -> button62;
            case 63 -> button63;
            case 64 -> button64;
            case 65 -> button65;
            case 66 -> button66;
            case 67 -> button67;
            case 68 -> button68;
            case 69 -> button69;
            case 70 -> button70;
            case 71 -> button71;
            case 72 -> button72;
            case 73 -> button73;
            case 74 -> button74;
            case 75 -> button75;
            case 76 -> button76;
            case 77 -> button77;
            case 78 -> button78;
            case 79 -> button79;
            case 80 -> button80;
            case 81 -> button81;
            case 82 -> button82;
            case 83 -> button83;
            case 84 -> button84;
            case 85 -> button85;
            case 86 -> button86;
            case 87 -> button87;
            case 88 -> button88;
            case 89 -> button89;
            case 90 -> button90;
            case 91 -> button91;
            case 92 -> button92;
            case 93 -> button93;
            case 94 -> button94;
            case 95 -> button95;
            case 96 -> button96;
            case 97 -> button97;
            case 98 -> button98;
            case 99 -> button99;
            case 100 -> button100;
            case 101 -> button101;
            case 102 -> button102;
            case 103 -> button103;
            case 104 -> button104;
            case 105 -> button105;
            case 106 -> button106;
            case 107 -> button107;
            case 108 -> button108;
            case 109 -> button109;
            case 110 -> button110;
            case 111 -> button111;
            case 112 -> button112;
            case 113 -> button113;
            case 114 -> button114;
            case 115 -> button115;
            case 116 -> button116;
            case 117 -> button117;
            case 118 -> button118;
            default -> null;
        };
    }
/*
    public static void main(String[] args) {

        ViewSwing view = new ViewSwing();
    }

 */
}



