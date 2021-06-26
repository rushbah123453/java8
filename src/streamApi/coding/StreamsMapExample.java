package streamApi.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.io.PrintStream;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static void main(String[] args) {
        System.out.println(studentsList());
        System.out.println(studentSet());
    }

    public static List<String> studentsList() {
        List<String> studentList = StudentDataBase.getAllStudents()
                .stream() //  Stream<Students>
                .map(Student::getName)// Stream<String>
                .collect(Collectors.toList());  // List<String>
        return studentList;
    }

    public static Set<String> studentSet(){
        Set<String> studentSet=StudentDataBase.getAllStudents()
                .stream()
                .map(student -> student.getName())
                .collect(Collectors.toSet());
        return studentSet;
    }

}
