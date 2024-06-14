import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExamplesLambda {
    public static void main(String[] args) {
        Predicate<String> largerThan5 = s -> s.length() > 5;
        boolean result = largerThan5.test("hello");
        System.out.println(result);

        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("hello functional programming");

        doSomething(largerThan5);
        doSomething(s -> s.startsWith("A"));
    }

    public static void doSomething(Predicate<String> p) {
        System.out.println(p.test("doSomething"));
    }

}
