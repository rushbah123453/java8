package functionalInterfaces.coding;

import java.util.function.UnaryOperator;

public class UnaryOperatorFunctionalInterfaceExample {


    static UnaryOperator<String> unaryOperator = x -> x.toUpperCase();

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("lowercase"));
    }
}
