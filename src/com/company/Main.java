package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date is : " +today);
        LocalTime time = LocalTime.now();
        System.out.println("Today is :" +today.getDayOfMonth());
    }
}
