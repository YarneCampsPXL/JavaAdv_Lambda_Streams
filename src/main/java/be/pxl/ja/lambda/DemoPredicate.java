package be.pxl.ja.lambda;

import be.pxl.ja.exercise1.Student;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {

        Predicate<String> isLangerDan10 = (original) -> original.length() > 10;
        System.out.println(isLangerDan10.test("zebra"));
        System.out.println(isLangerDan10.test("luchthavenpersoneel"));


        // Consumer<String> printer = (s) -> System.out.println(s);
        Consumer<String> printer = System.out::println; // kortere versie van bovenstaande
        printer.accept("zebra");


        Consumer<Student> printScore = (student) -> System.out.println(student.getScore());
        Student tom = new Student("Tom", 2021, 92, LocalDate.of(2000, 3, 3));
        printScore.accept(tom);


        // Function<String, Integer> toLength = (s) -> s.length();
        Function<String, Integer> toLength = String::length; // kortere versie van bovenstaande
        System.out.println(toLength.apply("olifant"));
    }
}
