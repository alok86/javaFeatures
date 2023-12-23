package org.example.java12;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

public class CompactNumberFormatExample {
    public static void main(String[] args) {
        formatForLocal(Locale.US);
        formatForLocal(Locale.GERMANY);
    }

    private static void formatForLocal(Locale locale) {
        List<Integer> number = List.of(1500,1500000,1200000000);
        System.out.printf("--SHORT format for local = %s -- %n" , locale);
        number.stream().forEach((num)->{
            NumberFormat nf = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);
            try {
                Number n = nf.parse("3M");
                System.out.println(n);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

            nf.setRoundingMode(RoundingMode.HALF_DOWN);
            String format = nf.format(num);
            System.out.println(format);
        });
        System.out.printf("-- LONG format for locale=%s --%n", locale);
        number.forEach((num) -> {
            NumberFormat nf = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.LONG);
            nf.setRoundingMode(RoundingMode.HALF_DOWN);
            String format = nf.format(num);
            System.out.println(format);
        });
    }
}
