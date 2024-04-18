public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];

        animals[0] = new Dog("Buddy", 3, 15.5);

        animals[1] = new Pigeon("Bob", 2, 0.5, "White", "Rock Pigeon");

        animals[2] = new Blowfish("Bubbles", 1, 0.3);

        animals[3] = new Bird("Tweety", 1, 0.1, "Yellow");

        animals[4] = new Mammal("Tom", 5, 20.0);


        for (Animal animal : animals) {

            System.out.println(animal);

            animal.eat();

            System.out.println("Sound: " + animal.getVoice());

            if (animal instanceof AnimalMove) {

                ((AnimalMove) animal).move();
            }
            if (animal instanceof AnimalName) {

                AnimalName.name(animal.getName());
            }
            System.out.println();
        }

        AnimalBehavior[] animalBehaviors = {new Dog("Buddy", 3, 15.5), new Pigeon("Bob", 2, 0.5, "White", "Rock Pigeon"), new Blowfish("Bubbles", 1, 0.3)};

        for (AnimalBehavior animalBehavior : animalBehaviors)
        {
            animalBehavior.sleep();
        }
    }
}