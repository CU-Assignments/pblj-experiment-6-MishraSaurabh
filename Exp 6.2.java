//Create a program to use lambda expressions and stream operations to filter students scoring above 75%, sort them by marks, and display their names.

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85),
            new Student("Bob", 72),
            new Student("Charlie", 90),
            new Student("David", 65),
            new Student("Eve", 80)
        );

        // Filter students scoring above 75%, sort by marks, and display names
        List<String> topStudents = students.stream()
            .filter(student -> student.marks > 75)
            .sorted(Comparator.comparingDouble(student -> student.marks))
            .map(student -> student.name)
            .collect(Collectors.toList());
        
        System.out.println("Students scoring above 75% sorted by marks: " + topStudents);
    }
}
