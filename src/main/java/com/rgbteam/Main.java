/*
 * Copyright (c) 2023. fl_3650
 */

//test
package com.rgbteam;

import java.util.Scanner;
import com.rgbteam.chemistry.Compound;
import com.rgbteam.chemistry.PeriodicTable;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello User! I am the prototype of the top-secret V.I.K. program!");

        label:
        while (true) {
            System.out.println("""
                    
                    Enter:
                    1 -- get element info by its number (87, 43, etc.)
                    2 -- get element info by its short name ('H', 'As', etc.)
                    3 -- get element info by its full name ('Sodium', 'Neon', etc.)
                    4 -- count mass of a compound (M[Na Cl] = 58.44 g/mol, M[Fe S O 4] = 151.901 g/mol, etc.)
                    0 -- exit the program""");

            String choice = scanner.nextLine();

            switch (choice) {
                case "0":
                    System.out.println("Exiting...");
                    break label;
                case "1":
                    System.out.print("Enter element's number: ");
                    String inputNumber = scanner.nextLine();
                    try {
                        int elementNumber = Integer.parseInt(inputNumber);
                        PeriodicTable.Element element = PeriodicTable.getElementByNumber(elementNumber);
                        if (element != null)
                            System.out.println(element);
                        else
                            System.out.println("Element not found.");

                    } catch (NumberFormatException e) {
                        System.err.println("Invalid input.");
                    }
                    break;
                case "2": {
                    System.out.print("Enter short designation: ");
                    String inputDesignation = scanner.nextLine();
                    PeriodicTable.Element element = PeriodicTable.getElementByShortName(inputDesignation);
                    if (element != null)
                        System.out.println(element);
                    else
                        System.err.println("Element not found.");
                    break;
                }
                case "3": {
                    System.out.print("Enter full name: ");
                    String inputFullName = scanner.nextLine();
                    PeriodicTable.Element element = PeriodicTable.getElementByFullName(inputFullName);
                    if (element != null)
                        System.out.println(element);
                    else
                        System.err.println("Element not found.");

                    break;
                }
                case "4":
                    System.out.print("Enter compound (Separate elements, numbers and parenthesis using '-' or '_' or ' '): ");
                    Compound compound = new Compound(scanner.nextLine());
                    try {
                        String mass = compound.calculateAtomicMass();
                        System.out.println("The mass of the " + compound + " is: " + mass);
                    } catch (Exception e) {
                        System.err.println("Invalid input or element not found: " + e.getCause());
                    }
                    break;
                default:
                    System.err.println("No such command available");
                    break;
            }
        }
        scanner.close();
    }
}
