package com.nt.oopjavaservice.session;

public class Animal {
    private int feet;
    private String name;

    public Animal() {
        System.out.println("Contructor vacio de superclase");
    }


    public Animal(int feet, String name) {
        this.feet = feet;
        this.name = name;
        System.out.println("Contructor con parametros de superclase");
    }


    public int getFeet() {
        return feet;
    }

    public String getName() {
        return name;
    }
}
