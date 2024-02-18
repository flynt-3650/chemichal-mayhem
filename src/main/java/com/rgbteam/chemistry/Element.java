/*
 * Copyright (c) 2024. RGBTeam
 */


package com.rgbteam.chemistry;

import java.util.Arrays;
import java.util.Objects;

public class Element {
    private final String fullName;
    private final String shortName;
    private final int atomicNumber;
    private final boolean isMetal;
    private final double atomicMass;
    private final double molarMass;
    private final int protonAmount;
    private final int neutronAmount;
    private final int electronAmount;
    private final int[] valencies;

    public Element(String shortName, String fullName, int number, boolean isMetal, double atomicMass, int[] valence) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.atomicNumber = number;
        this.protonAmount = number;
        this.electronAmount = number;
        this.isMetal = isMetal;
        this.atomicMass = atomicMass;
        this.molarMass = atomicMass / 10;
        this.neutronAmount = (int) atomicMass - number;
        this.valencies = valence;
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

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public int getProtonAmount() {
        return protonAmount;
    }

    public int getNeutronAmount() {
        return neutronAmount;
    }

    public int getElectronAmount() {
        return electronAmount;
    }
    public int[] getValencies() { return valencies; }

    public String toString() {
        StringBuilder valencesStr = new StringBuilder("[");
        for (int i = 0; i < valencies.length; i++) {
            if (i > 0) {
                valencesStr.append(", ");
            }
            valencesStr.append(valencies[i]);
        }
        valencesStr.append("]");

        // Возврат итоговой строки с данными элемента
        return "Element is " + fullName + " (" + shortName + ")\n" +
                "Atomic Number: " + atomicNumber + "\n" +
                "Is Metal: " + (isMetal ? "Yes" : "No") + "\n" +
                "Atomic Mass: " + atomicMass + " amu\n" +
                "Molar Mass: " + molarMass + " g/mol\n" +
                "Protons: " + protonAmount + "\n" +
                "Neutrons: " + neutronAmount + "\n" +
                "Electrons: " + electronAmount + "\n" +
                "Valence: " + valencesStr.toString(); // Использование преобразованной строки valencesStr
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
        result = prime * result + ((shortName == null) ? 0 : shortName.hashCode());
        result = prime * result + atomicNumber;
        result = prime * result + (isMetal ? 1231 : 1237);
        long temp;
        temp = Double.doubleToLongBits(atomicMass);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(molarMass);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + protonAmount;
        result = prime * result + neutronAmount;
        result = prime * result + electronAmount;
        result = prime * result + Arrays.stream(valencies).sum();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return atomicNumber == element.atomicNumber &&
                isMetal == element.isMetal &&
                Double.compare(atomicMass, element.atomicMass) == 0 &&
                Double.compare(molarMass, element.molarMass) == 0 &&
                protonAmount == element.protonAmount &&
                neutronAmount == element.neutronAmount &&
                electronAmount == element.electronAmount &&
                Objects.equals(fullName, element.fullName) &&
                Objects.equals(shortName, element.shortName) &&
                Arrays.equals(valencies, element.valencies);
    }
}