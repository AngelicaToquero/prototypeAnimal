public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    @Override
    public Animal clone() {
        return new Sheep(legs, sound, food, name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    @Override
    public String toString() {
        return "Sheep\n" +
               "Name: " + name + "\n" +
               "Legs: " + legs + "\n" +
               "Sound: '" + sound + "'\n" +
               "Food: " + food;
    }

    public int getLegs() {
        return legs;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }
}
