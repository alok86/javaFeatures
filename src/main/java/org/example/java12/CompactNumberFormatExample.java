package org.example.java12;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class CompactNumberFormatExample {
    public static void main(String[] args) {
        formatForLocal(Locale.US);
        formatForLocal(Locale.GERMANY);
    }

    private static void formatForLocal(Locale locale) {
        List<Integer> number = List.of(1000,1000000,1000000000);
        System.out.printf("--SHORT format for local = %s -- %n" , locale);
        number.stream().forEach((num)->{
            NumberFormat nf = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);
            String format = nf.format(num);
            System.out.println(format);
        });
        System.out.printf("-- LONG format for locale=%s --%n", locale);
        number.forEach((num) -> {
            NumberFormat nf = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.LONG);
            String format = nf.format(num);
            System.out.println(format);
        });
    }
}
