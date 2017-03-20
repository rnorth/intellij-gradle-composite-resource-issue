/**
 * When run via IntelliJ run, `null` will be printed to stderr instead of the URL of the resource.
 *
 * When run through `./gradlew run`, a URL for the resource (which is in ../somedep/src/main/resources) will be printed.
 *
 * In both cases, the class ClassDependency is successfully printed.
 */
public class Main {

    public static void main(String[] args) {
        System.err.println(ClassDependency.class.getClassLoader().getResource("someresource.txt"));
        System.err.println(ClassDependency.class);
    }
}
