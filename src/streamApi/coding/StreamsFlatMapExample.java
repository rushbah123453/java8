package streamApi.coding;

import functionalInterfaces.coding.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

//Usecase: print students activities
public class StreamsFlatMapExample {

    public static void main(String[] args) {
        System.out.println(studentActivity());
    }

    private static List<String> studentActivity() {
        List<String> studentActivity = StudentDataBase.getAllStudents().stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .collect(toList());
        return studentActivity;
    }
}
