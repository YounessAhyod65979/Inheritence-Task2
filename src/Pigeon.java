
public class Pigeon extends Bird implements AnimalBehavior, AnimalMove {
    protected String species;

    public Pigeon() {}

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public void coo() {
        System.out.println("Pigeon is cooing");
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", featherColor='" + featherColor + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
    @Override
    public void sleep() {
        System.out.println("Pigeon is sleeping");
    }

}