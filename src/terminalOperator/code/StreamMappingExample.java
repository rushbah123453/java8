package terminalOperator.code;

import functionalInterfaces.coding.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMappingExample {

    public static void main(String[] args) {
        System.out.println("Mapping to List() " + maptoList());
        System.out.println("Mapping to Set() " + maptoSet());
    }

    private static Set<String> maptoSet() {
        Set<String> studentSet = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(student -> student.getName(), Collectors.toSet()));
        return studentSet;
    }

    public static List<String> maptoList() {
        List<String> studentList = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(student -> student.getName(), Collectors.toList()));
        return studentList;
    }

}
