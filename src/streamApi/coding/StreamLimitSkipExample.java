package streamApi.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {


    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,5,2,8,9,18);
        Optional<Integer> limitedSum = limitSum(list);
        if (limitedSum.isPresent())
        {
            System.out.println("Limit: "+limitedSum.get());
        }

        Optional<Integer> skipSum = skipSum(list);
        if (skipSum.isPresent())
        {
            System.out.println("Skip: "+skipSum.get());
        }

    }

    public static Optional<Integer> limitSum(List<Integer> integerList)
    {
      return   integerList.stream()
                .limit(3) //only add first 3 elements
                .reduce((a,b)->a+b);
    }

    public static Optional<Integer> skipSum(List<Integer> integerList)
    {
        return   integerList.stream()
                .skip(3) //only skip first 3 elements
                .reduce((a,b)->a+b);
    }
}
