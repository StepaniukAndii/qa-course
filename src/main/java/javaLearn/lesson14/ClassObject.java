package javaLearn.lesson14;

public class ClassObject extends Object {

    public static void main(String[] args) {
        Object o = new Object();
        Object o2 = new Object();

        o.getClass();
        o.equals(o); // must
        o.hashCode(); //must
        o.toString();

        System.out.println(o.equals(o2));
    }
}
