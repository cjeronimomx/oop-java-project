package com.nt.oopjavaservice.util;

public class Strings {
    public static void main(String[] args) {
        String texto1 = "Karen";
        String texto2 = new String("Karen");
        String texto3 = "Karen";

        System.out.println(texto1 == texto2); //* comparando 2 variables de referencia, estan en el pool
        System.out.println(texto1 == texto3);
        System.out.println(texto1.equals(texto2));

        // Inmutabilidad, un objeto no cambia de estado
        String nombre = "Erika";        //guarda la referencia 0x1234
        nombre = nombre.concat(" Alma");   // 0x12345
        System.out.println(nombre);

        // Metodos anidados
        String marco =" Gutierrez Aguirre ";   // 0x1
                        // 0x2      // 0x3
        marco = marco.trim().concat(" Marco ");
                    // 0x3
        System.out.println(marco);

    }
}
