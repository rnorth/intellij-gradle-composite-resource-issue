/**
 * When run via IntelliJ run, `null` will be printed to stderr.
 *
 * When run through `./gradlew run`, a URL for the resource (which is in ../somedep/src/main/resources) will be printed.
 */
public class Main {

    public static void main(String[] args) {
        System.err.println(Main.class.getClassLoader().getResource("someresource.txt"));
    }
}
