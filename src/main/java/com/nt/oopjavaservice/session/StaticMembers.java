package com.nt.oopjavaservice.session;

import javax.swing.*;

public class StaticMembers {
    int normalCounter = 0;
    static  int staticCounter = 0;

    public static void main(String[] args) {
        StaticMembers normalObjetc = new StaticMembers();
        StaticMembers staticObject = new StaticMembers();

        normalObjetc.normalCounter = ++normalObjetc.normalCounter;
        normalObjetc.staticCounter = ++staticObject.staticCounter;

        JOptionPane.showMessageDialog(null, normalObjetc.normalCounter);
        JOptionPane.showMessageDialog(null, staticObject.staticCounter);

        String name = JOptionPane.showInputDialog("Dame tu nombre");
        JOptionPane.showMessageDialog(null, StaticMembers.greet(name));

    }

    public static String greet(String nameParameter) {
        return "hello:" + nameParameter;
    }
}
