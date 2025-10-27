package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream = numbers.stream();

        Stream<Integer> integerStream = Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 90);

        IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5,6,7,8,9,10});

        Stream.generate(() -> new Random().nextInt(10))
                .limit(10)
                .forEach(System.out::println);


        Set<Integer> nums = Set.of(2, 3, 4);
        Integer product = nums.stream()
                .reduce(1, (identity, element) -> identity + element);
        System.out.println(product);
    }
}
