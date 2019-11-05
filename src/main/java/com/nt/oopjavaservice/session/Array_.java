package com.nt.oopjavaservice.session;

import java.util.ArrayList;

public class Array_ {

    public static void main(String[] args) {
        //arrays();
        list();
    }

    public static void list(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Juan");
        lista.add("Pedro");

        String girl = lista.get(0);
        System.out.println(girl.length());

        System.out.println("Elementos: " + lista);
        System.out.println("Tamaño " + lista.size());


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(new Integer(8));

        Integer number = numbers.get(1);

        System.out.println(number);

        System.out.println(numbers.get(1));

    }

    public  static void arrays(){
        String servers[] = new String[4];
        for (int i = 0; i < servers.length; i++) {
            servers[i] = "Server" + i;
            System.out.println("i=" + i + " Dato="+servers[i]);
        }

        System.out.println("Servers" + servers);
    }

}
