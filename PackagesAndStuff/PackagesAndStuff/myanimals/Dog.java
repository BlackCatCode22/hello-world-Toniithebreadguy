package myanimals;

public class Dog extends Animal {
    // the cat class is a subclass of Animal.
    // So it should have all the methods from the Animal class
    // available to it
    //This is polymorhpism
    public void animalSound() {
        System.out.println("\n A sound from the Cat class used by a Dog object -'WOOF WOOF'");
    }
}
