package javaLearn.lesson16;

import java.util.Arrays;

public class Stream {

    public static void main(String[] args) {
        int[] array = {100, 2, 3, 5, 3, 2, 3, 4};

        array = Arrays.stream(array)
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(array));
    }
}
