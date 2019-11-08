package com.nt.oopjavaservice.session.access;

import javax.swing.*;

public class StaticMembers {
    int normalCounter = 0;
    static int staticCounter = 0;

    public static void main(String[] args) {
        StaticMembers normalObject = new StaticMembers();
        StaticMembers staticObject =  new StaticMembers();

        normalObject.normalCounter = ++normalObject.normalCounter;
        normalObject.staticCounter = ++normalObject.staticCounter;

        JOptionPane.showMessageDialog(null, normalObject.normalCounter);
        JOptionPane.showMessageDialog(null, normalObject.staticCounter);

        String name = JOptionPane.showInputDialog("Dame tu nombre:");
        JOptionPane.showMessageDialog(null, greet(name));
    }
    public static String greet(String name){
        return "Hello " + name + " =^.^=";
    }
}
