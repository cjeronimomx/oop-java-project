package com.nt.oopjavaservice.session;

import com.nt.oopjavaservice.util.File;

import javax.swing.*;

public class Exceptions {
    private Exceptions() {
        System.out.println("Error en constructor");
        new Exceptions();
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Iniciando mi programa....");
        try {
            throwException();
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        try {
            File file = null;
            JOptionPane.showMessageDialog(null, file.getName());
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Esto es un NullPointerException");
        }


        int number = 0;
        try {
            String text = "abc";
            number = Integer.parseInt(text);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error NumberFormatException");
        }

        JOptionPane.showMessageDialog(null, "Intentando hacer una division....");
        try {
            JOptionPane.showMessageDialog(null, "MY NUMBER IS: " + number);
            JOptionPane.showMessageDialog(null, 10/number);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error ArithmeticException");
        }

        JOptionPane.showMessageDialog(null, "El programa finalizo correctamente.... ");

        new Exceptions();

        memoryException();
    }


    public static void throwException() throws RuntimeException {
        JOptionPane.showMessageDialog(null, "Voy a a lanzar una Excepcion");
        throw new RuntimeException("Excepcion para Ericka");
    }

    public static void memoryException() {
        int x = 0;
        String text = "";
        System.out.println("error ....");
        memoryException();
    }
}
