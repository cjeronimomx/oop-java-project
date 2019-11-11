package com.nt.oopjavaservice.session.herencia;

public class Herencia {
    public static void main(String[] args) {
        TarjetaDebito tdd= new TarjetaDebito(12345, "Ana Rosas");
        TarjetaCredito tdc = new TarjetaCredito(121314, "Karen Rosas", 100000);

        System.out.println(tdd);
        System.out.println(tdc);
    }
}
