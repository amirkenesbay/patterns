package singleton.example4;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setUp();
    }
}
