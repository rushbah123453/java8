package methodNConstructorReference.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> studentbyGrade= RefactorMethodReferenceExample::test;

    private static boolean test(Student student) {
        return student.getGradeLevel() > 3;
    }

    public static void main(String[] args) {
        System.out.println(studentbyGrade.test(StudentDataBase.studentSupplier.get()));
    }
}
