package streamApi.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static Predicate<Student> studentGpaPredicate=student -> student.getGpa()>=3.8;
    static Predicate<Student> studentGradePredicate=student -> student.getGradeLevel()>=2;


    public static void main(String[] args) {
        Map<String, List<String>> stringListMap = StudentDataBase.getAllStudents().stream()
                .filter(studentGpaPredicate)
                .filter(studentGradePredicate)
                .collect(Collectors.toMap(student -> student.getName(), student -> student.getActivities()));
        System.out.println(stringListMap);
    }
}
