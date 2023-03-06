package javaLearn.lesson7;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

import java.sql.DriverManager;

public class ClassVsObject {

/*
    class it's sample
    object its instance
*/

//    public static void main(String[] args) {
//        Person andrii = new Person();
//        andrii.name = "Andrii";
//        andrii.age = 20;
//
//        System.out.println(andrii.name);
//        System.out.println(andrii.age);
//
//        Person vova = new Person();
//        vova.name = "Vova";
//        vova.age = 78;
//
//        System.out.println(vova.name);
//        System.out.println(vova.age);
//    }

    public static void main(String[] args) {
        Dog bobik = new Dog();
        bobik.voice();
    }
}
