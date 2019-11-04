package com.nt.oopjavaservice.util;

public class Strings {
    public static void main(String[] args){
        String texto1 = "Karen";
        String texto2 = new String("Karen");
        String texto3 = "Karen";

        System.out.println(texto1 == texto2);
        System.out.println(texto1 == texto3);
        System.out.println(texto1.equals(texto2));

        //Inmutabilidad
        String nombre = "Erika";             //0x1234  = Erika
        nombre = nombre.concat(" Alma");     //0x12345 = Erika Alma
        System.out.println(nombre);

        //Metodos Anidados
        String marco = " Gutierrez Aguirre ";   //0x1
            // 0x2    //0x3
        marco.trim().concat(" Marco ");
                    //0x1
        System.out.println(marco);

        marco = marco.trim().concat(" Marco ");
        //0x3
        System.out.println(marco);

    }
}
