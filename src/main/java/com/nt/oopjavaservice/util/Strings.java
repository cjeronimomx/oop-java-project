package com.nt.oopjavaservice.util;

import org.w3c.dom.ls.LSOutput;

public class Strings {
    public static void main(String[] args) {
        String texto1= "Marco";
        String texto2 = new String("Marco");
        String texto3 = "Marco";
        //System.out.println( texto1==texto2);
        //System.out.println( texto1==texto3);
        //System.out.println(texto1.equals(texto2));

        //Inmutabilidad
        String nombre="Erika";
        nombre = nombre.concat(" Alma");
        System.out.println(nombre);

        //Metodos anidados
        String marco =" Gutierrez Aguirre ";
        marco.trim().concat( "Marco");
        System.out.println(marco.trim());
        System.out.println(marco.trim().concat(" Marco"));


    }
}



