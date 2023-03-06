//package javaLearn.lesson10;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Array {
//
//    public static void main(String[] args) {
////        very bad
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//////        good solution
////        int[] array = {1, 2, 3};
////        float[] arrFloat = {1.7f, 6.5f};
////
//////        you must set limit
////        int[] arr = new int[1001];
////
////        arr[99] = 12;
////
////        System.out.println(arr[99]);
//
//        String[] strings = new String[10];
//        strings[0] = "kjbnjk";
//        strings[1] = "ksf;kjn";
////        System.out.println(strings.length);
//
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }
//
//        String[][] arr = new String[][]{
//                {"1", "2", "3"},
//                {"4"},
//                {"ljnbf"}
//        };
//
//        int[][] ar = new int[12][10];
//
//        ar[0][3] = 12;
//
//        int[] a = new int[78];
//
//        a.length
//
//
//    }
//
////    public static void main(String[] args) {
////        String[][] arr = new String[][]{
////                {"1", "2", "3"},
////                {"4", "3", "9"}
////        };
////
////        String[][] filteredMatrix = Arrays.stream(arr)
////                .map(row -> Arrays.stream(row)
////                        .filter(s -> !s.equalsIgnoreCase("1"))
////                        .toArray(String[]::new))
////                .toArray(String[][]::new);
////
////        System.out.println(Arrays.deepToString(filteredMatrix));
////
////        ArrayList<Person> people = new ArrayList<>();
////        people.add(new Person("Andrii2", 19));
////        people.add(new Person("Andrii3", 20));
////        people.add(new Person("Andrii1", 18));
////
////        List<String> strings = people.stream()
////                .filter(person -> person.getName().toLowerCase(Locale.ROOT).chars()
////                        .filter(el -> el == 'i').count() == 2)
////                .sorted(Comparator.comparing(Person::getAge))
////                .map(Person::getName)
////                .collect(Collectors.toList());
////
////        System.out.println(strings);
////    }
//}
//
//class Person {
//    private String name;
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
