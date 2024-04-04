
public class Dog extends Mammal {
    public Dog() {}

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}
