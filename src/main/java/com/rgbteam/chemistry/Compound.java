/*
 * Copyright (c) 2023. fl_3650
 */

package com.rgbteam.chemistry;

import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Compound {
    private final String[] parsedCompound;

    public Compound(String rawCompound) {
        StringTokenizer tokenizer = new StringTokenizer(rawCompound, "-_ ");

        int tokenCount = tokenizer.countTokens();
        this.parsedCompound = new String[tokenCount];

        for (int i = 0; i < tokenCount; i++) {
            this.parsedCompound[i] = tokenizer.nextToken();
        }
    }

    public String calculateAtomicMass() {
        // Create a stack to keep track of atomic masses and counts
        Stack<Double> stack = new Stack<>();

        // Iterate through each token in the parsedCompound array
        for (String token : parsedCompound) {
            // Check if the token is an element
            if (isElement(token)) {
                // Retrieve the atomic mass of the element from the PeriodicTable
                Element element = PeriodicTable.getElementByShortName(token);
                if (element != null) {
                    stack.push(element.getAtomicMass());
                }
            }
            // Check for an opening parenthesis "("
            else if (token.equals("(")) {
                // Push a placeholder 0.0 onto the stack to mark the start of a subexpression
                stack.push(0.0);
            }
            // Check for a closing parenthesis ")"
            else if (token.equals(")")) {
                double sum = 0.0;
                // Calculate the sum of atomic masses within the parentheses
                while (!stack.isEmpty() && stack.peek() != 0.0) {
                    sum += stack.pop();
                }
                // Pop the open parenthesis (0.0) from the stack
                if (!stack.isEmpty() && stack.peek() == 0.0) {
                    stack.pop();
                }
                int count = 1;
                // Check if there's a numeric coefficient preceding the closing parenthesis
                if (!stack.isEmpty() && isNumeric(String.valueOf(stack.peek()))) {
                    count = stack.pop().intValue();
                }
                // Push the result of (sum * count) onto the stack
                stack.push(sum * count);
            }
            // Check if the token is a numeric coefficient
            else if (isNumeric(token)) {
                int count = Integer.parseInt(token);
                // Multiply the top element on the stack (atomic mass) by the coefficient
                if (!stack.isEmpty() && stack.peek() != 0.0) {
                    double mass = stack.pop();
                    stack.push(mass * count);
                }
            }
        }

        double totalMass = 0.0;
        // Sum up the remaining values in the stack to obtain the total atomic mass
        while (!stack.isEmpty()) {
            totalMass += stack.pop();
        }

        // Format the total mass as a string with three decimal places
        return String.format("%.4f", totalMass);
    }

    private static boolean isElement(String token) {
        return PeriodicTable.getElementByShortName(token) != null;
    }

    private static boolean isNumeric(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(parsedCompound);
    }
}
