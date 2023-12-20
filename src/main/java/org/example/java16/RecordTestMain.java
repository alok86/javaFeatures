package org.example.java16;

import java.lang.reflect.Field;
import java.util.Arrays;

public class RecordTestMain {
    public static void main(String[] args) throws NoSuchMethodException {
        RecordTest rt = new RecordTest("abhay" , 27 , "pandeypur");
        System.out.println(rt.name()+"\n"+rt.address()+"\n"+rt.age());
        System.out.println(rt.toString());

        System.out.println("---Class annotations---");
        Arrays.stream(Person.class.getDeclaredAnnotations())
                .forEach(System.out::println);

        System.out.println("--Fields annotations--");
        Arrays.stream(Person.class.getDeclaredFields())
                .peek(x-> System.out.println("Field"+x))
                .map(Field::getDeclaredAnnotations)
                .forEach(annotations -> System.out.println("Annotation"+Arrays.toString(annotations)));

        System.out.println("--Constructor annotation--");
        Arrays.stream(Person.class.getDeclaredConstructor(String.class).getParameterAnnotations())
                .forEach(annotations -> System.out.println(Arrays.toString(annotations)));
    }
}
