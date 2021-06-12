package lambda.coding;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        /* ---- prior java8 ---- */
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Comparator 1: "+ comparator.compare(1,2));

        /* ---- after java8 ---- */
        Comparator<Integer> comparatorLambda=(a,b)-> a.compareTo(b);

        System.out.println("Comparator 2: "+comparatorLambda.compare(10,2));
    }
}
