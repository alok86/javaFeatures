package org.example.java14;

import java.time.LocalDate;
import java.time.Month;

public class SwitchStatementChangesExample {
    public static void main(String[] args) {
        showQuater(LocalDate.now().getMonth());
    }

    private static void showQuater(Month month) {
        String quarter = switch (month){
            case JANUARY:
            case FEBRUARY:
            case MARCH:
                // multiple statements case be used here
                yield "First Quarter";
            case APRIL:
            case MAY:
            case JUNE:
                yield "Second Quarter";
            case JULY:
            case AUGUST:
            case SEPTEMBER:
                yield "Third Quarter";
            case OCTOBER:
            case NOVEMBER:
            case DECEMBER:
                yield "Fouth Quarter";
            default:
                yield "Unknown Quarter";
        };
        System.out.println(quarter);
    }

}
