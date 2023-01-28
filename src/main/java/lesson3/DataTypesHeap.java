package lesson3;

import java.util.Locale;

public class DataTypesHeap {

    public static void main(String[] args) {
//        string pool
        String str = "Hi! My name str. What is your name?";

        System.out.println(str);


//        heap
        Byte b;
        Short s;
        Integer integer = 20;
        Long l;

        Float f;
        Double dou;

        Boolean bool;

        Character character;

        String stringInHEAP = new String("Hi! My name str. What is your name?");
//        ---------------------------------------------------------

        String string = String.format("Andrii %s", integer);
        System.out.println(string);

        String string2 = String.valueOf(integer);
        System.out.println(string2);

        String iHaveInt = "19000";
        int parseString = Integer.parseInt(iHaveInt);
        System.out.println(parseString);

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
