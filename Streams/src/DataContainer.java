public class DataContainer<T> {

    private T value;

    public DataContainer(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // Return a DataContainer instances for Strings
    static public DataContainer<String> createStringDataContainer() {
        // Alter this code to return a DataContainer with String for the parameterized type
        // Give it the value "Hello"
        return new DataContainer<String>("Hello");
    }
}
