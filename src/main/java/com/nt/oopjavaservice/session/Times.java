package com.nt.oopjavaservice.session;

import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {
        times();
    }

    public static void times(){
        LocalTime currentTime = LocalTime.now();
        LocalTime futureTime = LocalTime.of(12, 30, 01);
        currentTime = currentTime.plusHours(1);
        System.out.println("Hora actual " + currentTime);
        System.out.println("Hora de comer " + futureTime.minusSeconds(2));
    }

    public static void dates(){

    }
}
