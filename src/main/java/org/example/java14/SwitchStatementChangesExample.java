package org.example.java14;

import java.time.LocalDate;
import java.time.Month;

public class SwitchStatementChangesExample {
    public static void main(String[] args) {
        showQuater(LocalDate.now().getMonth());
    }

    private static void showQuater(Month month) {
        switch (month){
            case JANUARY , FEBRUARY , MARCH-> System.out.println("First Quarter");
            case APRIL , MAY , JUNE -> System.out.println("Second Quarter");
            case JULY , AUGUST , SEPTEMBER -> System.out.println("Third Quarter");
            case OCTOBER , NOVEMBER , DECEMBER -> System.out.println("Forth Quarter");
            default -> System.out.println("Unknown Quarter");
        }
    }

}
