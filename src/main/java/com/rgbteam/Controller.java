/*
 * Copyright (c) 2024. RGBTeam
 */


package com.rgbteam;

import com.rgbteam.chemistry.Compound;
import com.rgbteam.chemistry.Element;
import com.rgbteam.chemistry.PeriodicTable;

public class Controller {
    public Element retrieveElementByNumber(int number) {
        return PeriodicTable.getElementByNumber(number);
    }

    public Element retrieveElementByShortName(String shortName) {
        return PeriodicTable.getElementByShortName(shortName);
    }

    public Element retrieveElementByFullName(String fullName) {
        return PeriodicTable.getElementByFullName(fullName);
    }

    public double calculateCompoundsAtomicMass(String rawCompound) {
        Compound compound = new Compound(rawCompound);
        return compound.calculateAtomicMass();
    }
}
