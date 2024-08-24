// JH 8/20/24
/*
 *
 *
 * PayrollProgram.java
 *
 * Input: User's name, weekly hours worked(No hour fractions), user's hourly
 *
 * Processing: total weekly pay including overtime if more than 40
 *   hours were worked that week.
 *
 * Output: Polite greeting you the user and regular pay and overtime pay
 *
 *
 */
//

import java.util.Scanner;

public class PayrollProgram {

    static void theHellomethod(){
        System.out.println(" \n Hello from theHelloMethod() ! ");
    }

    // Create a method that gets input.
    static void aPersonalGreeting(String someName ) {
        System.out.println(" \n Hello " + someName + " how are you today?" );
    }

    // Create a method that gets two larger integers and returns their sum.
    // Create two int parameters
    static int SumTwoInts(int num1, int num2) {
        int mySum = num1 + num2;
        return mySum;
    }

    public static void main(String[] args) {

        System.out.println("\n\n....Welcome to the Payroll Program...\n");

        // Variables (members)
        String theUserName = "";

        // Create a Scanner object for the user input.
        Scanner scanner = new Scanner(System.in);  // Corrected here

        // Get the user's name.
        System.out.println("\n Please enter your name");
        theUserName = scanner.nextLine();
        // Call (Invoke) our greeting method

        theHellomethod();

        // Call our new sum method and store the result in aSum.
        int aSum = SumTwoInts(3, 4);

        System.out.println(" \n aSum is: " + aSum);

        System.out.println("\n This is the end of my program");

    }
}
