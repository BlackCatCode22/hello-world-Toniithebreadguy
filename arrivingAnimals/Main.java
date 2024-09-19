//JH
// 09/19/2024
//

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.printf("\nWelcome to the zoo program");

        try {
        // Open the arrivingAnimals folder
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\BE218\\Desktop\\Folder1\\arrivingAnimals.txt"));
        String myLine;

        // Read the file one line at a time
        while ((myLine = bufferedReader.readLine()) != null) {
            System.out.println(myLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Create an Animal object.
        Animal myAnimalObject = new Animal();

        myAnimalObject.setAge(100);

        // Use our new Animal Object.
       System.out.println("\n My animal's age is: " + myAnimalObject.getAge() + " years old. ");

        // Create hyena object
       Hyena myNewHyena = new Hyena();

       // output the age of our Hyena
        System.out.println("\n The age of our Hyena is: " + myNewHyena.getAge() + "Years old");

        Lion myNewLion = new Lion();
        myNewLion.setAge(12);

        System.out.println("\n The age of our Lion is: " + myNewLion.getAge() + "Years old");

        // Output the number of animals.
        System.out.println("\n The number of animals created is: " + Animal.numOfAnimals);








    }
}