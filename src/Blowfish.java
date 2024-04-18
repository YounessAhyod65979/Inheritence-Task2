
public class Blowfish extends Fish  implements AnimalBehavior, AnimalMove {
    public Blowfish() {}

    public Blowfish(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void blowBubbles() {
        System.out.println("Blowfish is blowing bubbles");
    }

    @Override
    public void sleep() {

        System.out.println("Blowfish is sleeping");
    }
    @Override
    public void move() {

        System.out.println("Blowfish swim");
    }
}