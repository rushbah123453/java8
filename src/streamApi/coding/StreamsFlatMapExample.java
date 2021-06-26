package streamApi.coding;

import functionalInterfaces.coding.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

//Usecase: print students activities
public class StreamsFlatMapExample {

    public static void main(String[] args) {
        System.out.println(studentActivity());
        System.out.println("Distinct "+distinctStudentActivity());
        System.out.println("Sorted "+sortStudentActivity());
        System.out.println("Count "+countStudentActivity());

    }


    private static List<String> studentActivity() {
        List<String> studentActivity = StudentDataBase.getAllStudents().stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .collect(toList());
        return studentActivity;
    }

    private static List<String> distinctStudentActivity() {
        List<String> studentActivity = StudentDataBase.getAllStudents().stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct() // distinct
                .collect(toList());
        return studentActivity;
    }

    private static List<String> sortStudentActivity() {
        List<String> studentActivity = StudentDataBase.getAllStudents().stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct()
                .sorted() // sort
                .collect(toList());
        return studentActivity;
    }

    private static long countStudentActivity() {
       long studentCount = StudentDataBase.getAllStudents().stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct() // distinct
                .count();
        return studentCount;
    }
}
