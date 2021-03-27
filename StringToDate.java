package com.abhi;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class StringToDate {
    public static void main(String[] args) {
        String str="03-12-2021";
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate localDate=LocalDate.parse(str, formatter);

        System.out.println(localDate);
    }
}
