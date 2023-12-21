package org.example.java14;

import java.util.List;

/*
* In Java 14 the instanceof operator
* is extended to take a type test pattern
* instead of just a type.
* Before Java 14
if (obj instanceof String) {
    String s = (String)obj;
}
* */
public class PMIOEX1 {
    public static void main(String[] args) {
        printLen("abc");
        /*There are no changes to how instanceof works
        when the target is null. That is, the pattern will
        only match, and s will only be assigned, if obj is
        not null.*/
        printLen(null);
        printLen(List.of("apple","banana","pie",""));
    }

    private static void printLen(Object object) {
        if(object instanceof String str){
            printStringLen(str);
        }else if(object instanceof List list){
            for(Object o :list){
                if(o instanceof String str && str.length()>1){
                    printStringLen(str);
                }
            }
        }
    }

    private static void printStringLen(String str) {
        System.out.printf("String : %s , Length: %s%n",str,str.length());
    }
}
