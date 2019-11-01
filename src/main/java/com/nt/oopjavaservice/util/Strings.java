package com.nt.oopjavaservice.util;

public class Strings {

    public static void main(String[] args) {
        String texto1="Karen";
        String text2= new String("Karen");
        String text3 = "Karen";

        System.out.println(texto1 == text3);
        System.out.println(texto1 == text2);
        System.out.println(texto1.equals(text2));

        //  variable =  Objeto;
        String marco = " Gutierrez Aguirre";
        marco.trim().concat(" Marco ");
        System.out.println(marco);
    }
}
