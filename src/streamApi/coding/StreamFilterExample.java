package streamApi.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static void main(String[] args) {

        filterStudent().forEach(System.out::println);
    }

    public static List<Student> filterStudent()
    {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("male"))
                .collect(Collectors.toList());
    }
}
