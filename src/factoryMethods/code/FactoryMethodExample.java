package factoryMethods.code;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

// of(), iterate(), generate()
public class FactoryMethodExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("rushabh", "rahul", "xyz");
        stringStream.forEach(s-> System.out.println(s));

        Stream.iterate(1, x -> x * 2)
                .limit(5)
                .forEach(System.out::println);

        Supplier<Integer> random= new Random()::nextInt;
        Stream.generate(random)
                .limit(2)
        .forEach(System.out::println);

    }
}
