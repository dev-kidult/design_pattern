package builderPattern;

public class Main {
    public static void main(String[] args) {
        BuilderClass builderClass = new BuilderClass.Builder().id("id").name("name").build();
    }
}
