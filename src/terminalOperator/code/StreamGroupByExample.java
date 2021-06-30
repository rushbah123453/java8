package terminalOperator.code;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamGroupByExample {

    public static void main(String[] args) {
        System.out.println("Group by Gender: "+groupByGender());
        System.out.println("Group by Grade: "+groupByCustomValue());

        System.out.println("Group by Grade: "+twoLevelGrouping());

        System.out.println("Three Argument GroupBy "+threeArgumentGroupping());
    }

    private static LinkedHashMap<Integer, Set<Student>> threeArgumentGroupping() {

      return  StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getGradeLevel(), LinkedHashMap::new,Collectors.toSet()));
    }

    private static Map<Integer, Map<String, List<Student>>> twoLevelGrouping() {
       return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getGradeLevel(),
                        Collectors.groupingBy(student -> student.getGpa()>=3.9?"OUTSTANDING":"AVERAGE")));
    }

    private static Map<String, List<Student>> groupByGender() {
     Map<String, List<Student>> studentMap=  StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getGender()));
     return studentMap;
    }

    private static Map<String, List<Student>> groupByCustomValue() {
        Map<String, List<Student>> studentMap=  StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()>3.8?"OUTSTANDING":"Average"));
        return studentMap;
    }
}
