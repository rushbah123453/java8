package functionalInterfaces.coding;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorFunctionalInterfaceExample {

    static BinaryOperator<Integer> binaryOperator=(x,y)-> x*y;
    static Comparator<Integer> comparator=(a, b)-> a.compareTo(b);
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(1,2));

        BinaryOperator<Integer> max=BinaryOperator.maxBy(comparator);
        System.out.println("max: "+max.apply(2,3));

        BinaryOperator<Integer> min=BinaryOperator.minBy(comparator);
        System.out.println("min: "+min.apply(2,3));

    }
}
