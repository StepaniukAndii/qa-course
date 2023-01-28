package lesson13;

public class AbstractClassVsInterface {


    public static void main(String[] args) {
        AmericanMan americanMan = new AmericanMan();
        americanMan.createAmericanMan("Mark", 90);

        System.out.println(americanMan.getAge());
        System.out.println(americanMan.getName());
    }
}
