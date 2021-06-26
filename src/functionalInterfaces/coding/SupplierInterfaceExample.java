package functionalInterfaces.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceExample {

    public static void main(String[] args) {
        Supplier<Student> supplier=()->{
            return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"),1);
        };
        System.out.println(supplier.get());

        Supplier<List<Student>> listSupplier=()-> StudentDataBase.getAllStudents();
        System.out.println(listSupplier.get());
    }
}
