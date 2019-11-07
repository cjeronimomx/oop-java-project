package com.nt.oopjavaservice.session;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;

public abstract class Times {
    public abstract void run(int numerox);

    public static int test() {
        int num1;
        int num2;

        return 0;
    }

    public static void main(String[] args) {
        // Times objeto = new Times();
        //objeto.times();
         times();
        //dates();
        // datetimes();
    }

    public static void times() {
        LocalTime currentTime = LocalTime.now();
        LocalTime futureTime = LocalTime.of(12, 30, 1);

        currentTime = currentTime.plusHours(1);

        System.out.println("HORA ACTUAL: " + currentTime);
        System.out.println("HORA DEFINIDA: " + futureTime.minusSeconds(2));
    }

    public static void dates(int numero1, boolean decision) {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.minusWeeks(2);
        System.out.println("FECHA ACTUAL: " + localDate);

        LocalDate futureDate = LocalDate.of(2020, Month.AUGUST, 14);
        futureDate.plusYears(1);
        System.out.println("BIRTHDAY: " + futureDate);
    }

    public static void datetimes() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("FECHA HORA ACTUAL:" + localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("FECHA DE UN DATETIME: " + localDate);
    }
}
