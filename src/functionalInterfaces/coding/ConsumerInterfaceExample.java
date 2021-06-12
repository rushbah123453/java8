package functionalInterfaces.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

    static Consumer<Student> studentConsumer = x -> System.out.println(x);
    static Consumer<Student> studentNameConsumer = x -> System.out.print(x.getName());
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        Consumer<String> consumer = (a) -> System.out.println("To UpperCase: " + a.toUpperCase());
        consumer.accept("consumer");
        printNameAndActivities();
        printNameAndActivitiesWithCondition();
    }

    private static void printNameAndActivitiesWithCondition() {
        System.out.println("In printNameAndActivitiesWithCondition: ");
        studentList.forEach(x -> {
            if (x.getGradeLevel() > 2) {
                studentNameConsumer.andThen(studentConsumer).accept(x);
            }
        });

    }

    private static void printNameAndActivities() {
        System.out.println("In printNameAndActivities: ");
        studentList.forEach(studentNameConsumer.andThen(studentConsumer));
    }
}
