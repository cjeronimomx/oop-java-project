package com.nt.oopjavaservice.session.herencia;

public class TarjetaDebito extends TarjetaBancaria{
    private double saldo;

    public TarjetaDebito(int numCuenta, String nombreCliente, double saldo){
        super(numCuenta, nombreCliente);
        this.saldo = saldo;
    }

    public TarjetaDebito(int numCuenta, String nombreCliente){
        super(numCuenta, nombreCliente);
    }

    @Override
    public String toString() {
        return "TarjetaDebito{" +
                "saldo=" + saldo +
                ", numCuenta=" + numCuenta +
                ", nombreCliente='" + nombreCliente + '\'' +
                '}';
    }
}
