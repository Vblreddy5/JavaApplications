import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Answer {

        // Change these boolean values to control whether you see
        // the expected result and/or hints.
        static boolean showExpectedResult = false;
        static boolean showHints = false;

        // Return the highest grade for the students with a specific major
        public static int findAnswer(List<Student> students, String major){
            // Your code goes here.
            return students.stream()
                    .filter(s -> major.equals(s.getMajor()))
                    .flatMap(s -> s.getGrades().values().stream())
                    .max(Integer::compareTo).orElseGet(() -> 0);

    }
    static Map<Integer, BigInteger> findAnswer(List<Integer> numbers) {
        // Your code goes here.
        return null;
    }
}



