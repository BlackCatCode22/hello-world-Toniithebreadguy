// JH 9/3/24
//
//
//
//
//
//
public class ForEachArrays {
    public static void main(String[] args) {

        System.out.printf("\n welcome to my For each practice");

        // Create an array of cars. Do this two different ways and be able to talk to your lab partner.

        // create a cars []
        String[] cars = {"BMW", "Tesla", "Honda"};

        // Output the cars array using a for each loop
        for(int i = 0; i <= 2; i++){
            System.out.println(cars[i]);
        }
        System.out.println("\n My for loop is done.");

        // Use a for : each loop to do the same thing
        for (String car:cars ) {
            System.out.println(car);
        }

        // Create a string array using the new operator.
        // Create a 4 element String arrays named myCars.
        String[] myCars = new String[4];

        // MyCars[0], myCars[1], myCars[2]. myCars[3]

        // Fill the newly created String[] array with data.
        myCars[0] = "Tesla";
        myCars[1] = "GMC";
        myCars[2] = "Jeep";
        myCars[3] = "Honda";

        // Use a for : each loop to output the myCars[] array.
        for (String car : myCars) {
            System.out.println("\n A in myCars[] array is: " + car);
        }

        String[] myStrings = new String[6];



        // Use a for loop to fill the array with some strings
        int aNum = 0;
        for (int i = 0; i < 6; i++){
            // fill my array with strings
            myStrings[i] = "this is string number: " + (i + 1);
            aNum++;
        }

        // Now... use a for : each loop to output the myStrings[] array
        for (String aStr : myStrings) {

            System.out.println("An element in myStrings[] is " + aStr);
        }

        // Lets reverse a string.
        String reversedStr = "abcdefg";
        // Output reversedStr.
        System.out.println("reversedStr before reversion loop is: " + reversedStr);

        // Output the chars of myStrToReverse
        for (int i = reversedStr.length()-1; i >= 0; i--) {
            char charToAdd = reversedStr.charAt(i);
            reversedStr = reversedStr.concat(Character.toString(charToAdd));
        }

        // Output reversedStr.
        System.out.println("reversedStr after reversion loop is: " + reversedStr);


    }
}
