package streamApi.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

public class StudentMatchExample {

    public static void main(String[] args) {
        System.out.println(anyMatch());
        System.out.println(allMatch());
        System.out.println(noneMatch());

    }

    private static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream().noneMatch(student -> student.getGpa()>=5.0);

    }

    private static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream().allMatch(student -> student.getGpa()>=4.0);

    }

    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa()>=3.0);
    }
}
