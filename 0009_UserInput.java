import java.util.*;
import java.util.Scanner;                                                    // import Scanner Class for inputs
public class UserInput {
    public static void main(String[] args){ 
        Scanner input = new Scanner((System.in));                            // Creation of a Scanner object
        System.out.println("Enter a String: ");

        String input1 = input.nextLine();                                    // Reads user input as a string
        System.out.println("The string entered is " + input1);               // Print the output
    }
}
