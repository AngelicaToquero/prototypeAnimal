public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep(4, "Baa", "Grass", "Prototype");
        cowPrototype = new Cow(4, "Moo", "Hay");
        horsePrototype = new Horse(4, "Neigh", "Oats", "Black");
    }

    public Animal createSheep(String name) {
        Sheep prototype = (Sheep) sheepPrototype.clone();
        return new Sheep(prototype.getLegs(), prototype.getSound(), prototype.getFood(), name);
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}
