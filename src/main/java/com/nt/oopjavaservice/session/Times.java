package com.nt.oopjavaservice.session;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Times {
    public static void main(String[] args){
    //times();
     //dates();
     datestimes();
    }

    public static void times() {
        LocalTime currentTime = LocalTime.now();
        LocalTime futureTime = LocalTime.of(15,40,19);

        currentTime =currentTime.plusHours(2);

        System.out.println("HORA ACTUAL: " + currentTime);
        System.out.println("HORA DEFINIDA: " + futureTime.minusSeconds(5));
    }

    public static void dates(){
        LocalDate localDate = LocalDate.now();
        localDate = localDate.minusWeeks(2);
        System.out.println("FECHA ACTUAL: " + localDate);

        LocalDate futureDate = LocalDate.of(2020, Month.AUGUST,14);
        System.out.println("BIRTHDAY: " + futureDate);

    }

    public static void datestimes(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("FECHA HORA ACTUAL: " + localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("FECHA DE UN DATETIME: " + localDate);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("HORA DE UN DATETIME: " + localTime);

    }
}
