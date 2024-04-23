package week2;

import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an uppercase character
        System.out.print("Enter an uppercase character: ");
        char uppercaseChar = scanner.next().charAt(0);

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Convert the uppercase character to lowercase
        char lowercaseChar = convertToLowerCase(uppercaseChar);

        // Display the lowercase character
        System.out.println("Lowercase character: " + lowercaseChar);
    }

    // Method to convert an uppercase character to lowercase
    public static char convertToLowerCase(char uppercaseChar) {
        // Check if the character is an uppercase letter (A-Z)
        if (uppercaseChar >= 'A' && uppercaseChar <= 'Z') {
            // Convert the uppercase character to lowercase by adding the ASCII difference
            // between uppercase and lowercase characters (i.e., 'A' - 'a')
            return (char) (uppercaseChar + ('a' - 'A'));
        } else {
            // Return the same character if it is not an uppercase letter
            return uppercaseChar;
        }
    }
}

