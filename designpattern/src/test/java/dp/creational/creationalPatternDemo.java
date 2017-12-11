package dp.creational;

public class creationalPatternDemo {
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
//        SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        SingleObjectType2 object1 = SingleObjectType2.getInstance();

        //show the message
        object.methodOne();
        object1.methodOne();
    }
}
