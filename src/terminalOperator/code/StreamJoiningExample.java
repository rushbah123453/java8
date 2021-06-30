package terminalOperator.code;

import functionalInterfaces.coding.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamJoiningExample {


    public static String joining_1(){
       return StudentDataBase.getAllStudents().stream()
                .map(student -> student.getName())
                .collect(Collectors.joining());

    }
    public static String joining_2(){
        return StudentDataBase.getAllStudents().stream()
                .map(student -> student.getName())
                .collect(Collectors.joining("-"));

    }
    public static String joining_3(){
        return StudentDataBase.getAllStudents().stream()
                .map(student -> student.getName())
                .collect(Collectors.joining("-","(",")"));

    }

    public static void main(String[] args) {
        System.out.println("Joining 1: "+joining_1());
        System.out.println("Joining 2: "+joining_2());
        System.out.println("Joining 3: "+joining_3());
    }
}
