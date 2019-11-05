package com.nt.oopjavaservice.session;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arrays_ {
    public static void main(String[] args) {
        list();
        //Arrays
    }
        public static void list() {
        //Declaración e instanciacion de una lista
            ArrayList<String> names = new ArrayList<>();

            //Agregacion de elementos de una lista
        names.add("Erika");
        names.add("Erik");
        names.add("Jose luis");

        // Obtencion de elemento de una lista
        String girl = names.get(0);

            System.out.println(girl.length());

            //Tamaño de una lista
            System.out.println("TAMANO: " + names.size());

            //Imprension del contenido de una lista
            System.out.println("ELEMENTOS:" + names);

            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1); // posicion 0
            numbers.add(4); // posicion 1
            numbers.add(new Integer(8));

            Integer number = numbers.get(1);
            System.out.println(number);

            System.out.println(numbers.get(1));
            
        }
        public static void arrays() {
        String[] servers = new String[4];

        for (int i = 0; i < servers.length ; i++) {
        servers[i] = "Server" + i;
        System.out.println("i=" + i + "Dato=" + servers[i]);
    }
            System.out.println(servers);
}
}