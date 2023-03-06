package javaLearn.lesson12;

import javaLearn.lesson7.Person;

import java.util.*;

public class CollectionsLesson {

    public static void main(String[] args) {

//        work with class Object
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("123");

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("123");

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);

        List<Person> people = new ArrayList<>();
        people.add(new Person());
        people.add(new Person());
        people.add(new Person());

        Set<Boolean> booleans = new HashSet<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);

        for (boolean boll : booleans) {
            System.out.println(boll);
        }

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.peek());
    }
}
