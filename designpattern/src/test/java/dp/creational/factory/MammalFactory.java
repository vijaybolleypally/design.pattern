package dp.creational.factory;

public class MammalFactory extends SpeciesFactory {
    public AnimalAbs getAnimal(String type) {
        return type.toLowerCase().contains("dog") ? new DogSubCls() : new CatSubCls();
    }
}
