package com.nt.oopjavaservice.session;

import javax.swing.*;

public class StaticMembers {
    int normalCounter = 0;
    static int staticCounter = 0;

    public static void main(String[] args) {
        StaticMembers normalObject = new StaticMembers();
        StaticMembers staticObject = new StaticMembers();

        normalObject.normalCounter = ++normalObject.normalCounter;
        ++StaticMembers.staticCounter;

        JOptionPane.showMessageDialog(null, normalObject.normalCounter);
        JOptionPane.showMessageDialog(null, staticObject.staticCounter);


        String name = JOptionPane.showInputDialog("Dame tu nombre");
        JOptionPane.showMessageDialog(null, StaticMembers.greet(name));
    }


    public static String greet(String nameParameter) {
        return "hello: " + nameParameter;
    }

    public static  int test() { return 1;}
}
