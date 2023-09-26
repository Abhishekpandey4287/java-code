@FunctionalInterface
interface aani {
    void show();
}

public class learnFunctionExpression {
    public static void main(String[] args) {
        aani f = () -> System.out.println("Hello from the lambda expression!");

        f.show();
    }
}
