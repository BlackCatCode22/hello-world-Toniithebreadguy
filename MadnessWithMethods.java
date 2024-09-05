import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Madness with Methods!");

        int userInputNumber = 0;

        userInputNumber = getUserInput();
        System.out.println("\nThe user input the number: " + userInputNumber);

        // Find the largest of two ints.
        int myFirstNum = 8;
        int mySecondNum = 4;

        // Call the method named compareTwoInts()
        int largest = compareTwoInts(myFirstNum, mySecondNum);
        System.out.println("\nThe largest of " + myFirstNum + " and " + mySecondNum + " is: " + largest);

        // Find the sum of two ints
        int sum = sumTwoInts(myFirstNum, mySecondNum);
        System.out.println("\nThe sum of " + myFirstNum + " and " + mySecondNum + " is: " + sum);
    }

    // Method to get user input
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextInt();
    }

    // Method to compare two integers and return the larger one
    public static int compareTwoInts(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    // Method to return the sum of two integers
    public static int sumTwoInts(int num1, int num2) {
        return num1 + num2;
    }
}
