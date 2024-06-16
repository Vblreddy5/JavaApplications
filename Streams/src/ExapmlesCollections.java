import java.util.ArrayList;
import java.util.List;

public class ExapmlesCollections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Marry-Ann");
        names.add("Carlos");
        names.add("Apuray");
        names.remove(2);
        System.out.println(names); // Output: [Marray-Ann, Apuray]
    }
}
