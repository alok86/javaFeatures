package org.example.java16;
/*
* 1 . Records can not extend other class
* 2 . Records are final means can not extend
* 3 . Records can implement interface like Serializable
* 4 . Records cannot create extra instance fields
* 5 . The components of a record are implicitly final means
* 6 . Records can have static fields
* 7 . The static methods, static fields, static initializers are allowed
* 8 . Record can not be abstract*/

import java.util.Objects;

public record RecordTest(String name , int age, String address) {
    //extra field
    //private int height;

    // as name is implicitly final mean new value can not be assigned
    //    public void changeName(String newName){
    //        this.name = newName;
    //    }

    // Static member weather it is data or function are allowed
    //    private static int count = 10;
    //
    //    public static void main(String[] args) {
    //        RecordTest person = new RecordTest("John", 29, "lahurabir");
    //        System.out.println(person);
    //        System.out.println(RecordTest.count);
    //    }

    // We can add explicit accessors
    public int age(){
        return age<0?0:age;
    }

    // Extra instance methods are allowed

    public void printName(){
        System.out.println(name);
    }

    // Nested records are allowed

    // Generic records are allowed

     public record Line<N extends Number>(N length){

     }

    // We can declare constructors for example

    public RecordTest{
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
        if(age<=0){
           throw new IllegalArgumentException("Age must be greater than 0");
        }
    }



    // The static methods, static fields, static initializers are allowed
    static int count;
    static{
        count = 20;
    }

    public static void showCount(){
        System.out.println(count);
    }

    public static void main(String[] args) {
        RecordTest.showCount();
        RecordTest test = new RecordTest("simmi", 38, "near by");
        System.out.println(test);
        Line<Double> line = new Line<>(5.3);
        System.out.println(line);
    }
}
