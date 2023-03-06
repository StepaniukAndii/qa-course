package javaLearn.lesson6;

public class VoidReturn {

    public static void main(String[] args) {
        name();

        int id = getId();
        System.out.println(id);

        int sum = sum(1078424, 798935);
        System.out.println(sum);

//        what is it!!!!!!!!!!!!!!????????????????

        int what = sum(sum(sum(sum, sum), sum(sum, sum)), sum(sum, sum));
//        I HATE IT
        System.out.println(getString());
//        I LOVE QA
    }

    public static void name() {
        System.out.println("My name Andrii");
    }

    public static int getId() {
        return 17;
    }

    public static int sum(int first, int second) {
        return first + second;
    }

    public static String getString() {
        return "My name is QA AUTO";
    }
}
