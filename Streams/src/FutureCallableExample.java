import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class FutureCallableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return  42;
        };

        Future<Integer> future = executorService.submit(task);

        try {
            Integer result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);
        Map<Integer, BigInteger> result = Answer.findAnswer(numbers);
    }
}
