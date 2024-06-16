import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExamplesStreamAPI {
    public static void main(String[] args) {

        //Creating a Stream from a Collection
        List<String> names = Arrays.asList("Lori", "Christa", "Maaike");

        //Creating a Stream from an Array
        String[] namesArray = {"Isra", "Jonas", "Gaia"};
        Stream<String> namesArrayStream = Arrays.stream(namesArray);

        //Creating a Stream using Stream.of()
        Stream<String> namesOfStream = Stream.of("Ismael", "David", "Anreas");

        List<String> moreNames = Arrays.asList("Nabeel", "Yousser", "Ali", "Adam", "Syed");

        List<String> filteredNames = moreNames.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
