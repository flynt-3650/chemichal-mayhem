/*
 * Copyright (c) 2023. fl_3650
 */

package com.rgbteam.chemistry;

import javax.swing.*;

public class PeriodicTable extends JFrame {
    public static class Element {
        private final String fullName;
        private final String shortName;
        private final int atomicNumber;
        private final boolean isMetal;
        private final double atomicMass;
        private final double molarMass;

        public Element(String shortName, String fullName, int number, boolean metal, double atomicMass) {
            this.shortName = shortName;
            this.fullName = fullName;
            this.atomicNumber = number;
            this.isMetal = metal;
            this.atomicMass = atomicMass;
            this.molarMass = atomicMass / 10;
        }

        public String getShortName() {
            return shortName;
        }

        public String getFullName() {
            return fullName;
        }

        public int getNumber() {
            return atomicNumber;
        }

        public boolean isMetal() {
            return isMetal;
        }

        public double getAtomicMass() {
            return atomicMass;
        }

        public double getMolarMass() {
            return molarMass;
        }

        @Override
        public String toString() {
            return "Element{ " +
                    "fullName='" + fullName + '\'' +
                    ", shortName='" + shortName + '\'' +
                    ", number=" + atomicNumber +
                    ", isMetal=" + isMetal +
                    ", atomicMass=" + atomicMass + "g/mol" +
                    ", molarMass=" + molarMass + "kg/mol" +
                    " }";
        }
    }
    private static final Element[] TABLE_LIST = {
            new Element("H", "Hydrogen", 1, false, 1.008),
            new Element("He", "Helium", 2, false, 4.0026),
            new Element("Li", "Lithium", 3, true, 6.94),
            new Element("Be", "Beryllium", 4, true, 9.0122),
            new Element("B", "Boron", 5, true, 10.81),
            new Element("C", "Carbon", 6, false, 12.011),
            new Element("N", "Nitrogen", 7, false, 14.007),
            new Element("O", "Oxygen", 8, false, 15.999),
            new Element("F", "Fluorine", 9, false, 18.998),
            new Element("Ne", "Neon", 10, false, 20.180),
            new Element("Na", "Sodium", 11, true, 22.990),
            new Element("Mg", "Magnesium", 12, true, 24.305),
            new Element("Al", "Aluminum", 13, true, 26.982),
            new Element("Si", "Silicon", 14, false, 28.085),
            new Element("P", "Phosphorus", 15, false, 30.974),
            new Element("S", "Sulfur", 16, false, 32.06),
            new Element("Cl", "Chlorine", 17, false, 35.45),
            new Element("Ar", "Argon", 18, false, 39.948),
            new Element("K", "Potassium", 19, true, 39.098),
            new Element("Ca", "Calcium", 20, true, 40.078),
            new Element("Sc", "Scandium", 21, true, 44.956),
            new Element("Ti", "Titanium", 22, true, 47.867),
            new Element("V", "Vanadium", 23, true, 50.942),
            new Element("Cr", "Chromium", 24, true, 51.996),
            new Element("Mn", "Manganese", 25, true, 54.938),
            new Element("Fe", "Iron", 26, true, 55.845),
            new Element("Co", "Cobalt", 27, true, 58.933),
            new Element("Ni", "Nickel", 28, true, 58.693),
            new Element("Cu", "Copper", 29, true, 63.546),
            new Element("Zn", "Zinc", 30, true, 65.38),
            new Element("Ga", "Gallium", 31, true, 69.723),
            new Element("Ge", "Germanium", 32, true, 72.630),
            new Element("As", "Arsenic", 33, true, 74.922),
            new Element("Se", "Selenium", 34, false, 78.971),
            new Element("Br", "Bromine", 35, false, 79.904),
            new Element("Kr", "Krypton", 36, false, 83.798),
            new Element("Rb", "Rubidium", 37, true, 85.468),
            new Element("Sr", "Strontium", 38, true, 87.62),
            new Element("Y", "Yttrium", 39, true, 88.906),
            new Element("Zr", "Zirconium", 40, true, 91.224),
            new Element("Nb", "Niobium", 41, true, 92.906),
            new Element("Mo", "Molybdenum", 42, true, 95.95),
            new Element("Tc", "Technetium", 43, true, 98.0),
            new Element("Ru", "Ruthenium", 44, true, 101.07),
            new Element("Rh", "Rhodium", 45, true, 102.91),
            new Element("Pd", "Palladium", 46, true, 106.42),
            new Element("Ag", "Silver", 47, true, 107.87),
            new Element("Cd", "Cadmium", 48, true, 112.41),
            new Element("In", "Indium", 49, true, 114.82),
            new Element("Sn", "Tin", 50, true, 118.71),
            new Element("Sb", "Antimony", 51, true, 121.76),
            new Element("Te", "Tellurium", 52, true, 127.60),
            new Element("I", "Iodine", 53, false, 126.904),
            new Element("Xe", "Xenon", 54, false, 131.294),
            new Element("Cs", "Cesium", 55, true, 132.91),
            new Element("Ba", "Barium", 56, true, 137.33),
            new Element("La", "Lanthanum", 57, true, 138.91),
            new Element("Ce", "Cerium", 58, true, 140.12),
            new Element("Pr", "Praseodymium", 59, true, 140.91),
            new Element("Nd", "Neodymium", 60, true, 144.24),
            new Element("Pm", "Promethium", 61, true, 145.0),
            new Element("Sm", "Samarium", 62, true, 150.36),
            new Element("Eu", "Europium", 63, true, 151.96),
            new Element("Gd", "Gadolinium", 64, true, 157.25),
            new Element("Tb", "Terbium", 65, true, 158.93),
            new Element("Dy", "Dysprosium", 66, true, 162.50),
            new Element("Ho", "Holmium", 67, true, 164.93),
            new Element("Er", "Erbium", 68, true, 167.26),
            new Element("Tm", "Thulium", 69, true, 168.93),
            new Element("Yb", "Ytterbium", 70, true, 173.05),
            new Element("Lu", "Lutetium", 71, true, 174.97),
            new Element("Hf", "Hafnium", 72, true, 178.49),
            new Element("Ta", "Tantalum", 73, true, 180.9479),
            new Element("W", "Tungsten", 74, true, 183.84),
            new Element("Re", "Rhenium", 75, true, 186.207),
            new Element("Os", "Osmium", 76, true, 190.2),
            new Element("Ir", "Iridium", 77, true, 192.22),
            new Element("Pt", "Platinum", 78, true, 195.08),
            new Element("Au", "Gold", 79, true, 196.96657),
            new Element("Hg", "Mercury", 80, true, 200.59),
            new Element("Tl", "Thallium", 81, true, 204.383),
            new Element("Pb", "Lead", 82, true, 207.0),
            new Element("Bi", "Bismuth", 83, true, 208.98040),
            new Element("Po", "Polonium", 84, true, 208.98243),
            new Element("At", "Astatine", 85, false, 209.98715),
            new Element("Rn", "Radon", 86, false, 222.01758),
            new Element("Fr", "Francium", 87, true, 223.01973),
            new Element("Ra", "Radium", 88, true, 226.02541),
            new Element("Ac", "Actinium", 89, true, 227.02775),
            new Element("Th", "Thorium", 90, true, 232.038),
            new Element("Pa", "Protactinium", 91, true, 231.03588),
            new Element("U", "Uranium", 92, true, 238.0289),
            new Element("Np", "Neptunium", 93, true, 237.048172),
            new Element("Pu", "Plutonium", 94, true, 244.06420),
            new Element("Am", "Americium", 95, true, 243.061380),
            new Element("Cm", "Curium", 96, true, 247.07035),
            new Element("Bk", "Berkelium", 97, true, 247.07031),
            new Element("Cf", "Californium", 98, true, 251.07959),
            new Element("Es", "Einsteinium", 99, true, 252.0830),
            new Element("Fm", "Fermium", 100, true, 257.09511),
            new Element("Md", "Mendelevium", 101, true, 258.09843),
            new Element("No", "Nobelium", 102, true, 259.10100),
            new Element("Lr", "Lawrencium", 103, true, 266.120),
            new Element("Rf", "Rutherfordium", 104, true, 267.122),
            new Element("Db", "Dubnium", 105, true, 268.126),
            new Element("Sg", "Seaborgium", 106, true, 269.128),
            new Element("Bh", "Bohrium", 107, true, 270.133),
            new Element("Hs", "Hassium", 108, true, 269.1336),
            new Element("Mt", "Meitnerium", 109, true, 277.154),
            new Element("Ds", "Darmstadtium", 110, true, 282.166),
            new Element("Rg", "Roentgenium", 111, true, 282.169),
            new Element("Cn", "Copernicium", 112, true, 286.179),
            new Element("Nh", "Nihonium", 113, true, 286.182),
            new Element("Fl", "Flerovium", 114, true, 290.192),
            new Element("Mc", "Moscovium", 115, true, 290.196),
            new Element("Lv", "Livermorium", 116, true, 293.205),
            new Element("Ts", "Tennessine", 117, false, 294.211),
            new Element("Og", "Oganesson", 118, false, 295.216)
    };

    public Element[] getTableList() { return TABLE_LIST; }

    public static Element getElementByShortName(String queryShortName) {
        for (Element item : TABLE_LIST)
            if (item.getShortName().equalsIgnoreCase(queryShortName))
                return item;

        return null;
    }

    public static Element getElementByFullName(String queryFullName) {
        for (Element item : TABLE_LIST)
            if (item.getFullName().equalsIgnoreCase(queryFullName))
                return item;

        return null;
    }

    public static Element getElementByNumber(int queryNumber) {
        if (queryNumber >= 1 && queryNumber <= TABLE_LIST.length)
            return TABLE_LIST[queryNumber - 1];

        return null;
    }
}
