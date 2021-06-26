package streamApi.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.Optional;

public class StreamMapReduceExample {

    public static void main(String[] args) {
        Optional<Integer> notebooks = noofNotebook();
        if (notebooks.isPresent())
        {
            System.out.println(notebooks.get());
        }
    }

    public static Optional<Integer> noofNotebook()
    {
        Optional<Integer> noOfNotebooks = StudentDataBase.getAllStudents().stream()
                .map(student -> student.getNotebooks())
                .reduce(Integer::sum); // (a,b) -> a+b

        return noOfNotebooks;

    }
}
