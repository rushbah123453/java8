package Optional.code;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseGetThrowExample {

    private static String optionalOrElse(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String studentString = student.map(student1 -> student1.getName()).orElse("Default");
        return studentString;
    }

    private static String optionalOrElseGet(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String studentString = student.map(student1 -> student1.getName()).orElseGet(()->"Default");
        return studentString;
    }

    private static String optionalOrElseThrow(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String studentString = student.map(student1 -> student1.getName()).orElseThrow(()->new RuntimeException());
        return studentString;
    }

    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());

    }
}
