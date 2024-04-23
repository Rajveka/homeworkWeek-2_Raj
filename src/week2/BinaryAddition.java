package week2;

import java.util.Scanner;


public class BinaryAddition {
    public static void main(String[] args) {
        // Input first binary number
        String binary1 = getInput("Input first binary number: ");

        // Input second binary number
        String binary2 = getInput("Input second binary number: ");

        // Add the binary numbers
        String sum = addBinary(binary1, binary2);

        // Display the sum of the binary numbers
        System.out.println("Sum of two binary numbers: " + sum);
    }

    // Method to get input from the user
    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    // Method to add two binary numbers
    public static String addBinary(String binary1, String binary2) {
        // Convert binary strings to integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the integers
        int sum = num1 + num2;

        // Convert sum to binary string
        return Integer.toBinaryString(sum);
    }
}

