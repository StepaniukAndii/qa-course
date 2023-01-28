package lesson7;

public class ClassVsObject {

/*
    class it's sample
    object its instance
*/

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Andrii";
        person.age = 20;

        System.out.println(person.name);
        System.out.println(person.age);
    }

//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.voice();
//    }

//    public static void main(String[] args) {
//        Car mustang = new Car();
//        mustang.setPrice(19000);
//        int priceMustang = mustang.getPrice();
//        System.out.println(priceMustang);
//
//        Car vw = new Car();
//        vw.setPrice(10);
//        int priceVW = vw.getPrice();
//        System.out.println(priceVW);
//    }
}
