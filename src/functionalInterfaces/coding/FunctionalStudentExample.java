package functionalInterfaces.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/*Input is students list and output is hashmap of students:GPA */
public class FunctionalStudentExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        studentNameAndGpa();
    }

    private static void studentNameAndGpa() {
        Function<List<Student>, Map<String, Double>> studentNameAndGpa = students -> {
            Map<String, Double> studentMap = new HashMap<>();
            studentList.forEach(student -> {
                if (PredicateStudentExample.studentbyGrade.test(student)) {
                    studentMap.put(student.getName(), student.getGpa());
                }
            });
            return studentMap;
        };
        System.out.println(studentNameAndGpa.apply(studentList));
    }

}
