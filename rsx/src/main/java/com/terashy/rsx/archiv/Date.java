package com.terashy.rsx.archiv;

import java.time.LocalDate;

/**
 * import date
 */
public class Date {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println("The date is: " + now.getDayOfMonth() + "." + now.getMonthValue() + "." + now.getYear());
        System.out.println("The date is: " + java.time.LocalDate.now());

    }

}
