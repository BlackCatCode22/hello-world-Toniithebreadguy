/*
* Jose Horta
* 8-29-2024
*LoopdAndArrays.java
*
*This program will use the for loop through
* a list of names stared in a string way
 */
import java.util.Scanner;

public class LoopsAndArrays {
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Welcome to my Friendly For Loop program \n");

        // Create a for loop that displays 'Hello There!' five times.

        // The loop control variable of this loop
        // is named i (it means integer (whole number))
        // this loop control variable must be: initialized, checked and changed.
        for (int i = 0; i < 10; i++) {
            System.out.println("The value if i is: " + i);
        }

        // Create a while loop that does the same thing.
        int loopControlVariable = 0;
        while (loopControlVariable < 10) {
            System.out.println("The value of loopControlVariable is: " + loopControlVariable);
            loopControlVariable++;
        }
        // Create a String array of five words.
        // String[] names = new String[10];
        String[] names = {"one","two","three","four","five","six","seven","eight", "nine","ten"};

        // Create an int array with 10 elements
        int[] myNumbers = new int[10];

        // Use a four loop to get ten whole numbers from the user.
        for (int i=0; i<10; i++){
            System.out.println("Please enter number " + (i+1) );
           myNumbers[i] = scanner.nextInt();

        }

        // Outputt the myNumbers[] array ..... with a for loop, using the length property
        for (int i=0; i<10; i++){
            System.out.println("The value of myNumbers [" + i + "] " + myNumbers);
        }

        System.out.println("\n one of our names os: " + names[4]);
        // Output the length of our array named name.
        System.out.println("\n The lengh of our arrray 'names' is: " + names.length);

        // Create a for loop that outputs all element values in the names array.
        for (int i=0; i < (names.length); i++) {
            System.out.println("names[" + i + "] is... " + names[i]) ;
        }

        System.out.println("\n This is the end of our program!\n" );


    }
}
