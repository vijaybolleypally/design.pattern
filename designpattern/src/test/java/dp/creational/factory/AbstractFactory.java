package dp.creational.factory;

public class AbstractFactory {
    public SpeciesFactory getSpeciesFactory(String type){
        return type.toLowerCase().contains("mammal") ? new MammalFactory() : new ReptileFactory();
    }
}
