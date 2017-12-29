package dp.creational.singleton;

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void methodOne() {
        System.out.println("methodOne from SingleObject");
    }
}
