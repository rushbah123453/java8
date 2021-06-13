package methodNConstructorReference.coding;

import java.util.function.Function;

public class FunctionalMethodReferenceExample {

    static Function<String,String> upperCase= String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(upperCase.apply("lowercase"));
    }
}
