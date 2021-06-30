package Optional.code;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    // Use Optional.of when you are are not sure that string will always be !=null
    private static Optional<String> ofNullable(){
        return Optional.ofNullable("AnyString");
    }


    // Use Optional.of when you are sure string !=null
    private static Optional<String> of(){
        return Optional.of("AnyString");
    }

    // used to adhere the return type of method
    private static Optional<String> empty(){
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(ofNullable().get());
        System.out.println(of().get());
        System.out.println(empty());

    }


}
