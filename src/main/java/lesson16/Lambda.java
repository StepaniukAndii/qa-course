package lesson16;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {

    public static void main(String[] args) {
        Predicate predicate = o -> false;

        Supplier<Integer> supplier = () -> 1;

        Function<String, Integer> function = str -> Integer.parseInt(str);
    }
}
