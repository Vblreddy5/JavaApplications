import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create students
        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 90);
        grades1.put("Science", 80);

        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Math", 85);
        grades2.put("Science", 88);

        Map<String, Integer> grades3 = new HashMap<>();
        grades3.put("Math", 92);
        grades3.put("Science", 75);

        Student student1 = new Student("Alice", "Smith", "Computer Science", grades1);
        Student student2 = new Student("Bob", "Johnson", "Computer Science", grades2);
        Student student3 = new Student("Charlie", "Brown", "Mathematics", grades3);

        // Add students to list
        List<Student> students = Arrays.asList(student1, student2, student3);

        // Find the highest grade for a specific major
        String major = "Computer Science";
        int highestGrade = Answer.findAnswer(students, major);
        System.out.println("The highest grade for major " + major + " is: " + highestGrade);
    }
}