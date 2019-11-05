package com.nt.oopjavaservice.session;

import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {
        times();
    }
    public static void times() {
        LocalTime currentTime = LocalTime.now();
        LocalTime futureTime = LocalTime.of(12, 30, 4);
        currentTime = currentTime.plusHours(1);

        System.out.println("HORA ACTUAL:" + currentTime);
        System.out.println("HORA DEFINIDA:" + futureTime.minusSeconds(2));

    }

    public static void dates() {

    }
}
