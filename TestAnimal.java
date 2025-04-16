public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheperd = registry.createSheep("Sheperd");
        Animal cauly = registry.createCow();
        Animal horseey = registry.createHorse();

        System.out.println("=== Animal Sounds ===");
        sheperd.makeSound();
        cauly.makeSound();
        horseey.makeSound();

        System.out.println("\n=== Animal Details ===");
        System.out.println(sheperd);
        System.out.println();
        System.out.println(cauly);
        System.out.println();
        System.out.println(horseey);
    }
}
