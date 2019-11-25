package com.nt.oopjavaservice.session;

import javax.swing.*;

public class Exception {
    private Exception(){
        System.out.println("Error en Constructor");
        new Exception();
   }

   public static void main(String[] args) {
    try{

    }   String text = "abc";
        JOptionPane.showMessageDialog(null,"Antes de la Excepcion");
    new Exception();
    memoryException();
   // }

    }

}
