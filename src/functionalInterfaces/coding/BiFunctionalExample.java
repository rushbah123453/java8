package functionalInterfaces.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionalExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction=(studentList,studentPredicate)->{
      Map<String,Double> studentMap=new HashMap<>();
     studentList.forEach(student -> {
         if(studentPredicate.test(student)){
             studentMap.put(student.getName(),student.getGpa());
         }
     });
     return studentMap;
    };

    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();
        System.out.println(biFunction.apply(studentList,PredicateStudentExample.studentbyGrade));
    }

}
