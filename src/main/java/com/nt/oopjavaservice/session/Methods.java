package com.nt.oopjavaservice.session;

public class Methods {
    public static void main(String[] args) {
        Methods methods = new Methods();
        double resta = methods.rest(15.0, 5.0);
        double division =  methods.divider(2.0, 6.0);
        System.out.println(resta);
        System.out.println(division);
    }

    public double rest(double num1, double num2){
        return num1 - num2;
    }

    public double divider(double num1, double num2){
        return num1 / num2;
    }
}
