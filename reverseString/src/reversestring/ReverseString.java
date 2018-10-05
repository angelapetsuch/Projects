package reversestring;

import java.util.Scanner;

/**
 * Angela Petsuch
 * 
 *
 */
public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string and I will send it back reversed -- magically!");
        System.out.println();
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            String s = Console.getString("What would you like to say?: "); 

            StringBuilder sb = new StringBuilder(s); // create SB object from user input
            sb.reverse();
            
            System.out.println("Heres the backwards string you ordered!: " + sb);
            System.out.println();

            choice = Console.getString("Do you want to see more backward magicness? (y/n): ");
        } // end while loop
    } // end main method
} // end class
