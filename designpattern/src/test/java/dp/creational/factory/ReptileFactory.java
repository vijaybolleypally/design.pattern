package dp.creational.factory;

public class ReptileFactory extends SpeciesFactory{
    public AnimalAbs getAnimal(String type) {
        return type.toLowerCase().contains("snake") ? new SnakeSubcls() : new TyrannosaurusSubCls();
    }
}
