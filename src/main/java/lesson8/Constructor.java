package lesson8;

public class Constructor {

    public static void main(String[] args) {
        Phone sumsung = new Phone();
        System.out.println(sumsung.getColor());
        System.out.println(sumsung.getCores());

        Phone sumsungGreen = new Phone("green");
        System.out.println(sumsungGreen.getColor());
        System.out.println(sumsungGreen.getCores());

        Phone sumsung4CoresAndWhite = new Phone(4, "white");
        System.out.println(sumsung4CoresAndWhite.getColor());
        System.out.println(sumsung4CoresAndWhite.getCores());
    }
}
