//Jose Horta
// Stringpractice.java



public class Stringpractice {
     public static void main(String[] args) {

         System.out.println("\nWelcome to my String Practice program!\n");

         // Create a string object
         String myPracticeStr = "Hello from my String Practice Program";

         System.out.println("\n  myPracticeStr is: " + myPracticeStr);

         // Use a few String methods

         // toLowerCase() - Convert string to lowercase
         String myNewStr = myPracticeStr.toLowerCase();
         System.out.println("myNewStr is: " + myNewStr);

         // Use the length() method
         int myInt = myPracticeStr.length();
         System.out.println("\nThe length of \"" + myPracticeStr + "\" is " + myInt);

         // .contains() - Check if string contains a substring
         boolean isItThere = myPracticeStr.contains("STR");
         System.out.println("The value of isItThere is: " + isItThere);

         // charAt() - Get character at a specific index
         char myChar = myPracticeStr.charAt(4);
         System.out.println("\nThe char at index 4 is: " + myChar);

         // .indexOf() - Find the index of the first occurrence of a substring
         int mySecondInt = myPracticeStr.indexOf("STR");
         System.out.println("\nThe index of 'STR' is: " + mySecondInt);

         // .lastIndexOf() - Find the index of the last occurrence of a character
         int oneMoreInt = myPracticeStr.lastIndexOf("m");
         System.out.println("\nThe last index of 'm' is: " + oneMoreInt);

         // substring() - Extract a substring from a string
         String myLastStrObject;
         int indexOfSTR = myPracticeStr.indexOf("STR");

         // Check if "STR" is found
         if (indexOfSTR != -1) {
             myLastStrObject = myPracticeStr.substring(0, indexOfSTR);
             System.out.println("\nmyLastStrObject is: " + myLastStrObject);
         } else {
             System.out.println("\nSubstring 'STR' not found in the string.");
         }
     }
 }
