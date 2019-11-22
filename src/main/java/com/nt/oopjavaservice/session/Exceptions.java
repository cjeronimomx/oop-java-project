package com.nt.oopjavaservice.session;

import com.nt.oopjavaservice.util.File;

import javax.swing.*;

public class Exceptions {
    private Exceptions() {
        System.out.println("Error de constructor:");
        new Exceptions();
    }

    public static  void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Iniciando mi programa...");
        try {
            throwException();

            } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }

    }
}
