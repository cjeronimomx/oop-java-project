package com.nt.oopjavaservice.session;

import javax.swing.*;

public class Constructor {
    private int atributo1;
    private boolean atributo2;

    public static void main(String[] args) {
        Constructor object1 = new Constructor();
        Constructor object2 = new Constructor(1);
        Constructor object3 = new Constructor(24, true);

        JOptionPane.showMessageDialog(null, object1);
        JOptionPane.showMessageDialog(null, object2);
        JOptionPane.showMessageDialog(null, object3);
    }

    public Constructor() {}

    public Constructor(int atributo1) {
        this.atributo1 = atributo1;
    }

    public Constructor(int atributo1, boolean atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }


    @Override
    public String toString() {
        return "Constructor{" +
                "atributo1=" + atributo1 +
                ", atributo2=" + atributo2 +
                '}';
    }
}
