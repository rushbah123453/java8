package functionalInterfaces.coding;

import java.util.function.Function;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        functionalInterfaces();

    }

    private static void functionalInterfaces() {
        Function<String,String> upperCase=x-> x.toUpperCase();
        Function<String,String> concatinate=x->x.concat("-Concat");
        System.out.println(upperCase.apply("interface"));
        System.out.println(upperCase.andThen(concatinate).apply("Then"));
        System.out.println(upperCase.compose(concatinate).apply("Now"));
    }
}
