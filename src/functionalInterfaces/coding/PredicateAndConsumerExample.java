package functionalInterfaces.coding;

import functionalInterfaces.coding.data.Student;
import functionalInterfaces.coding.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    Predicate<Student> studentGpaPredicate = student -> student.getGpa() > 3;
    Predicate<Student> studentGradePredicate = student -> student.getGradeLevel() > 3;
    BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade > 3 && gpa > 3;

    BiConsumer<Student, List<String>> studentListBiConsumer = (name, activities) -> {
        System.out.println(name.getName() + " " + activities);
    };

    /*Using Predicate*/
    Consumer<Student> studentConsumer = student -> {
        if (studentGpaPredicate.and(studentGradePredicate).test(student)) {
            studentListBiConsumer.accept(student, student.getActivities());
        }
    };

    /*Using Bi-Predicate*/
    Consumer<Student> studentConsumerbiPredicate = student -> {
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            studentListBiConsumer.accept(student, student.getActivities());
        }

    };

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printStudentWithActivities(studentList);
        new PredicateAndConsumerExample().printStudentWithActivitiesWithBi(studentList);
    }

    private void printStudentWithActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }

    /*Using Bi-Predicate*/
    private void printStudentWithActivitiesWithBi(List<Student> studentList) {
        studentList.forEach(studentConsumerbiPredicate);
    }
}
