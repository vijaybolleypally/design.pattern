package dp.creational.singleton;

public class SingleObjectType2 {

    private static SingleObjectType2 instance;

    private SingleObjectType2() {
    }

    public static SingleObjectType2 getInstance() {
//        lazy Instantiation of Singleton Pattern
        if (instance == null) {
            synchronized (SingleObjectType2.class) {
                if (instance == null) {
                    instance = new SingleObjectType2();//instance will be created at request time
                }
            }
        }
        return instance;
    }

    public void methodOne() {
        System.out.println("methodOne from SingleObjectType2");
    }
}
