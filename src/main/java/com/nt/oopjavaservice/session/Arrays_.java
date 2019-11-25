package com.nt.oopjavaservice.session;


import java.util.ArrayList;

public class Arrays_{
    public static void main(String[] args) {

        list();
    }

    public static void list() {
        //Declaracion e instanciacion de una lista
        ArrayList<String> names = new ArrayList<>();

        //Agregacion de elemento de una lista
        names.add("Erika");
        names.add("Erik");
        names.add("Jose Luis");

        //Obtencion de elementos de una lista
        String girl = names.get(2);
        System.out.println(girl.length());

        //Tamaño de una lista
        System.out.println("TAMANO:" + names.size());

        //Impresion del contenido de una lista
        System.out.println("ELEMENTOS: " + names);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);  // posicion 0
        numbers.add(4);  // posicion 1
        numbers.add(new Integer(8));

        Integer number =numbers.get(1);
        System.out.println(number);
        System.out.println(numbers.get(0));

    }

    public static void arrays(){
        String servers[] = new String[4];

        for (int i = 0; i < servers.length ; i++) {
            servers[i] = "Server" + i;
            System.out.println("i=" + i + " Dato=" + servers[i]);

        }
        System.out.println(servers);
    }
}
