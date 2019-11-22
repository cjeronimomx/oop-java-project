package com.nt.oopjavaservice.session;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Times2 {
    public static void main(String[] args) {
        //times2();
        //times3();
        //times6();
    }

    public static void times2() {
        LocalDate date = LocalDate.of(2019, Month.JULY, 26);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(3);
        System.out.println(date);
        date = date.plusYears(2);
        System.out.println(date);

    }

    public static void times3() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }

    public static void times4() {
        LocalDate fecha1 = LocalDate.of(2019, Month.FEBRUARY, 23);
        LocalDate fecha2 = LocalDate.of(2019, 2, 23);
    }
}
