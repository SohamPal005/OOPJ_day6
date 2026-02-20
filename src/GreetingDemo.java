interface Greeting {
    void sayHello();
}

public class GreetingDemo {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.print("Hello. This is a greeting.");
            }
        };
    g.sayHello();
    }
}