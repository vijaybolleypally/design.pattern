package dp.creational;

import dp.creational.builder.*;
import dp.creational.factory.AbstractFactory;
import dp.creational.factory.AnimalFactory;
import dp.creational.prototype.Dog;
import dp.creational.prototype.Person;
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

    @Test
    public void builderPattern_Test1(){
        MealBuilder indianMeal = new IndianMealBuilder();
        MealDirector mealDirector = new MealDirector(indianMeal);
        mealDirector.constructMeal();
        System.out.println(mealDirector.getMeal().toString());

        MealBuilder japaneseMeal = new JapaneseMealBuilder();
        mealDirector = new MealDirector(japaneseMeal);
        mealDirector.constructMeal();
        System.out.println(mealDirector.getMeal().toString());
    }

    @Test
    public void prototypePattern_Test1(){
        Person person1 = new Person("Fred");
        System.out.println("person 1:" + person1);
        Person person2 = (Person) person1.doClone();
        System.out.println("person 2:" + person2);

        Dog dog1 = new Dog("Wooof!");
        System.out.println("dog 1:" + dog1);
        Dog dog2 = (Dog) dog1.doClone();
        System.out.println("dog 2:" + dog2);
    }
}
