public class MainPair {
    public static void main(String[] args) {
        Pair<String> namePair = new Pair<>("Gaia", "Jones");
        Pair<Integer> agePair = new Pair<>(8, 5);

        String firstName = namePair.getFirst();
        int firstAge = agePair.getFirst();

        System.out.println(firstName);
        System.out.println(firstAge);

        // Create a DataContainer instance using the createStringDataContainer method
        DataContainer<String> stringContainer = DataContainer.createStringDataContainer();

//        // Retrieve and print the value
//        String value = (String) stringContainer.getValue();
//        System.out.println("The value in the DataContainer is: " + value);
//
//        // Set a new value and print it
//        stringContainer.setValue("Goodbye");
//        value = (String) stringContainer.getValue();
        System.out.println("The new value in the DataContainer is: " + stringContainer);
    }
}

