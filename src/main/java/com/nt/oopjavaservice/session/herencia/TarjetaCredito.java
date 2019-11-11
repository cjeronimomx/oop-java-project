package com.nt.oopjavaservice.session.herencia;

public class TarjetaCredito extends TarjetaBancaria{
    private double lineaCredito;
    private double anualidad;

    public TarjetaCredito(int numCuenta, String nombreCliente, double lineaCredito){
        super(numCuenta, nombreCliente);
        this.lineaCredito = lineaCredito;
    }

    public TarjetaCredito(int numCuenta, double anualidad, String nombreCliente){
        super(numCuenta, nombreCliente);
        this.anualidad = anualidad;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "lineaCredito=" + lineaCredito +
                ", anualidad=" + anualidad +
                ", numCuenta=" + numCuenta +
                ", nombreCliente='" + nombreCliente + '\'' +
                '}';
    }
}

