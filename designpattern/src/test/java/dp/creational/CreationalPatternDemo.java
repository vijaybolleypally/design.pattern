package dp.creational;

import dp.creational.factory.AbstractFactory;
import dp.creational.factory.AnimalFactory;
import dp.creational.singleton.SingleObject;
import dp.creational.singleton.SingleObjectType2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreationalPatternDemo {
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

    @Test
    public void factoryPattern_Test1() {
        AnimalFactory animalFactory = new AnimalFactory();
        Assert.assertEquals(animalFactory.getAnimal("Dog").makeSound(), "BOV...BOV");
        Assert.assertEquals(animalFactory.getAnimal("cat").makeSound(), "Meow....");
    }

    @Test
    public void abstractFactoryPattern_Test1() {
        AbstractFactory abstractFactory = new AbstractFactory();
        Assert.assertEquals(abstractFactory.getSpeciesFactory("mammal").getAnimal("Dog").makeSound(), "BOV...BOV");
        Assert.assertEquals(abstractFactory.getSpeciesFactory("reptile").getAnimal("Snake").makeSound(), "Hiss");

    }
}
