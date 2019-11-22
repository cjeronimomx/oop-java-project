package com.nt.oopjavaservice.session;

import javax.swing.*;

public class Methonds {
    public static void main (String[] args) {
        Methonds objectReferenc = new Methonds();
        double varX =2.0;
        double varY =4.0;
        double result =0.0;
        result = objectReferenc.add(varX, varY, result);


    }

    public double add(double number1, double number2, double total) {
        total = number1 - number2;
        JOptionPane.showMessageDialog(null, total);
        return total;
    }

    public double add(double number1, double number2, double total, double total1) {
        total = number1 / number2;
        JOptionPane.showMessageDialog(null, total);
        return total;
    }
}
