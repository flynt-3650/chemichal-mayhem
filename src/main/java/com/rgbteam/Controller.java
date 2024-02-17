package com.rgbteam;

import com.rgbteam.chemistry.Compound;
import com.rgbteam.chemistry.Element;
import com.rgbteam.chemistry.PeriodicTable;

public class Controller {

    public Element retrieveElementByNumber(int number) {
        // ToDo: call getElementByNumber from PeriodicTable here & return Element
        return PeriodicTable.getElementByNumber(number);
    }

    public Element retrieveElementByShortName(String shortName) {
        // ToDo: call getElementByShortName from PeriodicTable here & return Element
        return PeriodicTable.getElementByShortName(shortName);

    }

    public Element retrieveElementByFullName(String fullName) {
        // ToDo: call getElementByFullName from PeriodicTable here & return Element
        return PeriodicTable.getElementByFullName(fullName);
    }

    public double calculateCompoundsAtomicMass(String rawCompound) {
        // ToDo: call calculateAtomicMass from Compound here & return value
        Compound compound = new Compound(rawCompound);
        return compound.calculateAtomicMass();
    }


}
