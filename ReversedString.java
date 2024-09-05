//JH
//09/5/24
//
//
import java.util.Scanner; // Import the Scanner class

public class ReversedString {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.print("Please enter a string to reverse: ");
        String userInput = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(userInput);

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
