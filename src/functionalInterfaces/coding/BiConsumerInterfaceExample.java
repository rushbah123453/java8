package functionalInterfaces.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerInterfaceExample {

    static BiConsumer<String,List<String>> studentConsumer = (x,y) ->{ System.out.print(x);System.out.println(y);};
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        System.out.println("In BiConsumerInterfaceExample");
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + " b: " + b);
        biConsumer.accept("first", "second");

        BiConsumer<Integer,Integer> multiply=(a,b)-> System.out.println("Multiplication of "+a+" x "+b+" = "+(a*b));
        BiConsumer<Integer,Integer> division=(a,b)-> System.out.println("Division of "+a+" x "+b+" = "+(a/b));

        multiply.andThen(division).accept(15,5);
        printNameAndActivities();
    }

    private static void printNameAndActivities() {
        System.out.println("In printNameAndActivities: ");
        studentList.forEach(student -> {studentConsumer.accept(student.getName(),student.getActivities());});
    }
}
