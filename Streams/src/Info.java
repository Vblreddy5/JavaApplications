
@MyCustomAnnotation(priority = 2, tags = {"important", "feature"})
public class Info {
    // fields omitted

    @MyCustomAnnotation(tags = {"details"})
    public void getDetailedInfo() {
        System.out.println("Giving important details...");
    }
}
