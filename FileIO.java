//JH 9/5/2024
//
//

import java.io.*;

public class FileIO {
    public static void main(String[] args) {

        // Writing to a file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("myoutput.txt"));
            writer.write("String to a file.");
            writer.write("\nHere is another line.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from the file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("myoutput.txt"));
            String line;
            // Corrected the while condition
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print the read line
            }
            reader.close(); // Moved outside the loop
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
