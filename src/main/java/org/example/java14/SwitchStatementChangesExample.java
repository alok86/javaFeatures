package org.example.java14;

import java.time.LocalDate;
import java.time.Month;

public class SwitchStatementChangesExample {
    public static void main(String[] args) {
        showQuater(LocalDate.now().getMonth());
    }

    private static void showQuater(Month month) {
        String quarter = switch (month){
            case JANUARY , FEBRUARY , MARCH-> "First Quarter";
            case APRIL , MAY , JUNE -> "Second Quarter";
            case JULY , AUGUST , SEPTEMBER -> "Third Quarter";
            case OCTOBER , NOVEMBER , DECEMBER -> "Forth Quarter";
        };
        System.out.println(quarter);
    }

}
