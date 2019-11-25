package com.nt.oopjavaservice.session;

import javax.swing.*;

public class Constructor {
    private int atributo1;
    private boolean atributo2;

    public static void main(String[] args) {
        Constructor object = new Constructor();
        JOptionPane.showMessageDialog(null,object);
    }

    public Constructor(){}

    public Constructor(int atributo1){
        this.atributo1 = atributo1;
    }

    public Constructor(int atributo1, boolean atributo2){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }
}
