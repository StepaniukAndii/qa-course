package lesson10;

public class Array {

    public static void main(String[] args) {
//        very bad
        int a = 1;
        int b = 2;
        int c = 3;

//        good solution
        int[] array = {1, 2, 3};

//        you must set limit
        int[] arr = new int[100];
        arr[99] = 12;

        System.out.println(arr[99]);

        String[] strings = new String[10];
        System.out.println(strings.length);
    }
}
