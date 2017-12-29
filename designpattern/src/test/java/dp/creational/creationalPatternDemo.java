package dp.creational;

import org.testng.annotations.Test;

public class creationalPatternDemo {
    @Test
    public void singletonPattern_Test1() {
        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.methodOne();
    }

    @Test
    public void singletonPattern_Test2() {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
//        SingleObject object = new SingleObject();

        //Get the only object available
        SingleObjectType2 object1 = SingleObjectType2.getInstance();

        //show the message
        object1.methodOne();
    }

}
