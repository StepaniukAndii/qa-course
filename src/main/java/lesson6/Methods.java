package lesson6;

public class Methods {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("hi" + a + b);

        int a1 = 1;
        int b1 = 2;
        System.out.println("hi" + a1 + b1);

        int a2 = 1;
        int b2 = 2;
        System.out.println("hi" + a2 + b2);

        int a3 = 1;
        int b3 = 2;
        System.out.println("hi" + a3 + b3);
//        ----------------------------------
//        better

        method();

        method();

        method();
//        -----------------------------------
//        best

        methodByThoParameter(1, 2);

        methodByThoParameter(1, 5);

        methodByThoParameter(100, 2);

//        what!!!!!!!!!!!!??????????????/


    }

    public static void method() {
        int a3 = 1;
        int b3 = 2;
        System.out.println("hi" + a3 + b3);
    }

    public static void methodByThoParameter(int a, int b) {
        System.out.println("hi" + a + b);
    }
}
