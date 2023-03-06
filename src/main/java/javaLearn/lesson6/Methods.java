package javaLearn.lesson6;

public class Methods {

    public static void main(String[] args) {
//        ----------------------------------
//        better

//        method();
//
//        method();
//
//        method();
//        -----------------------------------
//        best

        methodByThoParameter(1, 2);

        methodByThoParameter(1, 5);

        methodByThoParameter(100, 2);

        methodByThoParameter(12, 56);
//        what!!!!!!!!!!!!??????????????/


    }

    public static void method() {
        int a3 = 1;
        int b3 = 2;
        System.out.println("hi" + (a3 + b3));
    }

    public static void methodByThoParameter(int a, int b) {
        System.out.println("hi" + a + b);
    }
}
