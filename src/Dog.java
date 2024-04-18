
public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    public Dog() {}

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
    @Override
    public void move() {
        System.out.println("Dog run");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}