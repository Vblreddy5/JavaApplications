import java.lang.reflect.Method;
import java.util.Arrays;

public class MainAnn {
    public static void main(String[] args) {
        // Get the Info class object
        Class<Info> classData = Info.class;

        // Check if the class has our custom annotation
        if(classData.isAnnotationPresent(MyCustomAnnotation.class)) {
            // Get the custom annotation instance
            MyCustomAnnotation annotation = classData.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Prioriit: " + annotation.priority());
            System.out.println("Tags: " + Arrays.toString(annotation.tags()));
        }

        // Iterate over the methods in Info
        for (Method method : classData.getDeclaredMethods()) {
            // Check if the method has our custom annotation
            if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
                //Get the custom annotation instance
                MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + annotation.priority());
                System.out.println("Tags: " + Arrays.toString(annotation.tags()));

            }

        }
    }
}
