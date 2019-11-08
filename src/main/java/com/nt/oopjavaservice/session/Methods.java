package com.nt.oopjavaservice.session;

import javax.swing.*;
import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
        Methods objectReference = new Methods();
        double varX = 2.0;
        double varY = 4.0;
        double result = 0.0;
        result = objectReference.add(varX, varY, result);
        JOptionPane.showMessageDialog(null, result);

        objectReference.multiply(varX, varY, result);
        JOptionPane.showMessageDialog(null, result);
    }

    public double add(double number1, double number2, double total) {
        total = number1 + number2;
        JOptionPane.showMessageDialog(null, total);
        return total;
    }

    public double multiply(double number1, double number2, double result) {
        result = number1 * number2;
        JOptionPane.showMessageDialog(null, result);
        return result;
    }
}
