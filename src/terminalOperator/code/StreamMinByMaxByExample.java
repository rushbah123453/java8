package terminalOperator.code;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinByMaxByExample {

    public static void main(String[] args) {
        System.out.println("Min: "+min_By());
    }

    private static Optional<Student> min_By() {
      return   StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(student -> student.getGpa())));
    }
}
