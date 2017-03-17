# intellij-gradle-composite-resource-issue

See `composite-build-test/src/main/java/Main.java`

 * When run via IntelliJ run, `null` will be printed to stderr instead of the URL of the resource.
 * When run through `./gradlew run`, a URL for the resource (which is in ../somedep/src/main/resources) will be printed.
 * In both cases, the class ClassDependency is successfully printed.