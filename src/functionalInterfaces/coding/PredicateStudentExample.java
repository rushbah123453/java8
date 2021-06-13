package functionalInterfaces.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static List<Student> studentsList= StudentDataBase.getAllStudents();
    static Predicate<Student> studentbyGrade= student-> student.getGradeLevel()>3;
    static Predicate<Student> studentbyGpa= student-> student.getGpa()>3;


    public static void main(String[] args) {
        filterStudentByGrade();
        filterStudentByGpa();
        filterStudentByGpaOrGrade();
    }

    private static void filterStudentByGpaOrGrade() {
        System.out.println("In filterStudentByGpaOrGrade: ");
        studentsList.forEach(student -> {
            if (studentbyGrade.or(studentbyGpa).test(student))
            {
                System.out.println(student);
            }
        });

    }

    private static void filterStudentByGpa() {
        System.out.println("In filterStudentByGpa>3: ");
        studentsList.forEach(student -> {
            if(studentbyGpa.test(student))
            {
                System.out.println(student);
            }
        });

    }

    private static void filterStudentByGrade() {
        System.out.println("In filterStudentByGrade>3: ");
        studentsList.forEach(student -> {
            if (studentbyGrade.test(student))
            {
                System.out.println(student);
            }
        });
    }
}
