package lesson5;

public class IfElse {

    public static void main(String[] args) {
        int myAge = 10;

        if (myAge < 18) {
            System.out.println("WATER");
        } else {
            System.out.println("BEER");
        }

//        or

        if (myAge < 18) {
            System.out.println("WATER");
        } else if (myAge == 18) {
            System.out.println("WATER WITH BEER");
        } else {
            System.out.println("BEER");
        }

//        or

        if (!true) {
        }

        if (true) {

        }
    }
}
