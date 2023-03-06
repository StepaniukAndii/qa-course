package javaLearn.lesson3;

public class DataTypesHeap {

    public static void main(String[] args) {
//        string pool
        String str = "";

        System.out.println(str);


//        heap
        Byte b;
        Short s = null;
        Integer integer = 20;
        Long l;

        Float f;
        Double dou;

        Boolean bool;

        Character character;
//        ---------------------------------------------------------

        String string = "Andrii " + integer + " mbfkmbf " + integer;
        System.out.println(string);

        String string2 = String.valueOf(integer);
        System.out.println(string2);

        String iHaveInt = "19000";
        int parseString = Integer.parseInt(iHaveInt);
        System.out.println(parseString);

        System.out.println(str.chars());
        System.out.println(str.toUpperCase());

        String s1 = "blfjkfn";

        String mjn = s + s1;
    }
}
