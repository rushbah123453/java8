package streamApi.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,45,2,3,78,100,45);
        Optional<Integer> max = findmaxElement(integerList);
        if (max.isPresent())
        {
            System.out.println("max "+max.get());
        }

        Optional<Integer> min = findminElement(integerList);
        if (min.isPresent())
        {
            System.out.println("min "+min.get());
        }
    }

    public static Optional<Integer> findmaxElement(List<Integer> list){
        Optional<Integer> max = list.stream()
                .reduce(Integer::max);
        return max;
    }

    public static Optional<Integer> findminElement(List<Integer> list){
        Optional<Integer> min = list.stream()
                .reduce(Integer::min);
        return min;
    }
}
