package com.nt.oopjavaservice.session;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Times {
    public static void main(String[] args) {
        //times();
        dates();
        datetimes();
    }

    public static void times(){
        LocalTime currentTime = LocalTime.now();
        LocalTime futureTime = LocalTime.of(12, 30, 01);
        currentTime = currentTime.plusHours(1);
        System.out.println("Hora actual " + currentTime);
        System.out.println("Hora de comer " + futureTime.minusSeconds(2));
    }

    public static void dates(){
        LocalDate localDate = LocalDate.now();
        localDate = localDate.minusWeeks(2);
        System.out.println("Fecha actual " + localDate);

        LocalDate futureDate = LocalDate.of(2020, Month.AUGUST, 14);
        futureDate.plusYears(1);
        System.out.println("Cumpleaños " + futureDate);
    }

    public static void datetimes(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Fecha actual " + localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("Hora datetime " + localTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("Fecha datetime " + localDate);
    }
}
