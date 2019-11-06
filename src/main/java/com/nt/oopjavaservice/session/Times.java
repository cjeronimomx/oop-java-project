package com.nt.oopjavaservice.session;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Times {
    public static void main(String[] args) {
        times();
        dates();
        datestimes();
    }
    public static void times() {
        LocalTime currentTime = LocalTime.now();
        LocalTime futureTime = LocalTime.of(12, 30, 4);
        currentTime = currentTime.plusHours(1);

        System.out.println("HORA ACTUAL:" + currentTime);
        System.out.println("HORA DEFINIDA:" + futureTime.minusSeconds(2));

    }

    public static void dates() {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.minusWeeks(2);
        System.out.println("FECHA ACTUAL:" + localDate);

        LocalDate futureDate = LocalDate.of(2020, Month.AUGUST, 14);
        futureDate.plusYears(1);
        System.out.println("BIRTHDAY:" + futureDate);
    }

    public static void datestimes() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("FECAH HORA ACTUAL:" + localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("HORA DE UN DATETIME:" + localTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("FECHA DE UN DATETIME:" + localDate);
    }
}
