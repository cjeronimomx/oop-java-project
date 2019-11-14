package com.nt.oopjavaservice.session;

public class Cat extends Animal {
    public Cat() {
        System.out.println("Contructor vacio de subclase");
    }

    public Cat(int feet, String name) {
        super(feet, name);
        System.out.println("Contructor con parametros de subclase");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "feet=" + getFeet() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
