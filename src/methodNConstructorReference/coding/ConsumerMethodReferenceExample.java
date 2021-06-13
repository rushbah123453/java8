package methodNConstructorReference.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> studentActivities= Student::printActivities;
    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(studentActivities);
    }
}
