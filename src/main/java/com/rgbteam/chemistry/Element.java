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
    private final int[] oxidationState;
    private final int[] valencies;

    public Element(String shortName, String fullName, int number, boolean isMetal, double atomicMass, int[] oxidationState) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.atomicNumber = number;
        this.protonAmount = number;
        this.electronAmount = number;
        this.isMetal = isMetal;
        this.atomicMass = atomicMass;
        this.molarMass = atomicMass / 10;
        this.neutronAmount = (int) atomicMass - number;
        this.oxidationState = oxidationState;

        valencies = new int[oxidationState.length];
        for (int i = 0; i < oxidationState.length; i++) {
            valencies[i] = Math.abs(oxidationState[i]);
        }
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

    public int[] getOxidationState() {
        return oxidationState;
    }

    @Override
    public String toString() {
        return "Element is " + fullName + " (" + shortName + ")\n" +
                "Atomic Number: " + atomicNumber + "\n" +
                "Is Metal: " + (isMetal ? "Yes" : "No") + "\n" +
                "Atomic Mass: " + atomicMass + " amu\n" +
                "Molar Mass: " + molarMass + " g/mol\n" +
                "Protons: " + protonAmount + "\n" +
                "Neutrons: " + neutronAmount + "\n" +
                "Electrons: " + electronAmount + "\n" +
                "Valence: " + Arrays.toString(oxidationState) + "\n" +
                "Oxidation State: " + Arrays.toString(valencies);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Element element = (Element) o;

        if (atomicNumber != element.atomicNumber) return false;
        if (isMetal != element.isMetal) return false;
        if (Double.compare(atomicMass, element.atomicMass) != 0) return false;
        if (Double.compare(molarMass, element.molarMass) != 0) return false;
        if (protonAmount != element.protonAmount) return false;
        if (neutronAmount != element.neutronAmount) return false;
        if (electronAmount != element.electronAmount) return false;
        if (!Objects.equals(fullName, element.fullName)) return false;
        if (!Objects.equals(shortName, element.shortName)) return false;
        if (!Arrays.equals(oxidationState, element.oxidationState)) return false;
        return Arrays.equals(valencies, element.valencies);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + atomicNumber;
        result = 31 * result + (isMetal ? 1 : 0);
        temp = Double.doubleToLongBits(atomicMass);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(molarMass);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + protonAmount;
        result = 31 * result + neutronAmount;
        result = 31 * result + electronAmount;
        result = 31 * result + Arrays.hashCode(oxidationState);
        result = 31 * result + Arrays.hashCode(valencies);
        return result;
    }

}