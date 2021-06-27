package NumericStreams.code;

import java.util.List;
import java.util.stream.IntStream;

public class IntStreamExample {

    public static void main(String[] args) {

        System.out.println(sumOfNumber());
    }

    public static int sumOfNumber()
    {
     return    IntStream.rangeClosed(1,6)
                .sum();
    }
}
