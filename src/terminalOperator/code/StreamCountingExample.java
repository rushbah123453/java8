package terminalOperator.code;

import functionalInterfaces.coding.data.StudentDataBase;

import java.util.stream.Collector;

import static java.util.stream.Collectors.counting;

public class StreamCountingExample {

    public static void main(String[] args) {
        System.out.println("Count: "+count());
    }

    public static long count() {
        return StudentDataBase.getAllStudents().stream()
                .collect(counting());
    }
}
