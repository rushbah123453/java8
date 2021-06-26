package streamApi.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(integerList));
        Optional<Integer> value=performMultiplicationWithoutIdentity(integerList);
        if (value.isPresent()){
            System.out.println("Optional: "+value.get());
        }

        Optional<Student> student=getHighestGpa();
        if (student.isPresent())
        {
            System.out.println(student.get());
        }
    }

    public static long performMultiplication(List<Integer> integerList)
    {
      return   integerList.stream()
                // a= identity b =1 result=1
               // a=result=1 b=3 result=3
              // a=result=3 b=5 result=15
             //  a=result=15 b=7 result=105
                .reduce(1,(a,b)->a*b);
    }


    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList)
    {
        return   integerList.stream()
                .reduce((a,b)->a*b);
    }

    public static Optional<Student> getHighestGpa(){
       return StudentDataBase.getAllStudents().stream()
               .reduce((s1,s2)->s1.getGpa()>s2.getGpa()? s1:s2);
    }
}
