import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("One", 1);
        concurrentHashMap.put("Two", 2);

        concurrentHashMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
