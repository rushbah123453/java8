package functionalInterfaces.coding;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

    static  Predicate<Integer> predicateEven=i-> i%2==0;
    static  Predicate<Integer> predicateDivisibleBy5=i-> i%5==0;

    public static void main(String[] args) {
        System.out.println(predicateEven.test(2));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

    private static void predicateNegate() {
        System.out.println("Predicate Negate() : "+predicateEven.or(predicateDivisibleBy5).negate().test(12));

    }

    private static void predicateOr() {
        System.out.println("Predicate OR() : "+predicateEven.or(predicateDivisibleBy5).test(12));

    }

    private static void predicateAnd() {
        System.out.println("Predicate AND() : "+predicateEven.and(predicateDivisibleBy5).test(12));
    }
}
