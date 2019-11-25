package com.nt.oopjavaservice.session;

import javax.management.ValueExp;

public class Methods {
    public void main(String[] args) {
    Methods ObjectReference = new Methods();
    double varx = 5.0;
    double vary = 5.0;
    double result = 0.0;
    result = ObjectReference.Sustrac(varx,vary,result);

    }
    public double Sustrac (double varx, double vary, double result){
        double result1 = varx - vary;
        return result1;
    }


}
