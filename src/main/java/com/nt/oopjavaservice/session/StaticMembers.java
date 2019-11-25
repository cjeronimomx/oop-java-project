package com.nt.oopjavaservice.session;

import javax.swing.*;

public class StaticMembers {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Dame tu nombre");
        JOptionPane.showMessageDialog(null,StaticMembers.greet(name));

    }

    public static String greet(String nameParameter){
        return "Hello " + nameParameter;
    }

}
