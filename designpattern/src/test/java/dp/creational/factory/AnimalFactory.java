package dp.creational.factory;

public class AnimalFactory {
    public AnimalAbs getAnimal(String type) {
        return type.toLowerCase().contains("dog") ? new DogSubCls() : new CatSubCls();
    }
}