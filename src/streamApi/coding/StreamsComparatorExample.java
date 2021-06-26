package streamApi.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static void main(String[] args) {

        studentAscendingOrder().forEach(student -> System.out.println(student));
        studentGPAAscendingOrder().forEach(student -> System.out.println(student));
        studentGPADescendingOrder().forEach(student -> System.out.println(student));

    }

    public static List<Student> studentAscendingOrder()
    {
        System.out.println("Student Name in Ascending order");
        List<Student> studentList = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(student -> student.getName()))
                .collect(Collectors.toList());

        return studentList;
    }

    public static List<Student> studentGPAAscendingOrder()
    {
        System.out.println("Student GPA in Ascending order");
        List<Student> studentList = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(student -> student.getGpa()))
                .collect(Collectors.toList());

        return studentList;
    }

    public static List<Student> studentGPADescendingOrder()
    {
        System.out.println("Student GPA in Descending order");
        List<Student> studentList = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing((Student student) -> student.getGpa()).reversed())
                .collect(Collectors.toList());
        return studentList;
    }
}
