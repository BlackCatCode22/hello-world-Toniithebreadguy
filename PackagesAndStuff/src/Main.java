// JH 9/12/21
// Main.Java
import myanimals.Animal;
import myanimals.Dog;
import myanimals.Cat;
import mystudent.Student;
import mystudent.App;
public class Main {
    public static void main(String[] args) {
        System.out.printf("\nHello from the main!");

        // Create a Student object.
        Student student = new Student();

        // create an object from a runnable class.
        App app = new App();

        // Use a method from the student class.
        // I know that I have a static method on the Student class
        // and, I know how to call a static Class method
        Student.sayHello();

        //Call a method that belongs to the student object
        student.sayHi();

        // out the number of animals
        System.out.println("\n The number of animals is " + Animal.numofAnimals);

        // Create cat object
        Cat cat = new Cat();
        // Use a method that is available to the cat object named cat
        cat.animalSound();



        Dog Dog = new Dog();

        Dog.animalSound();


    }
}