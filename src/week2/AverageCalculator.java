package week2;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println("Enter three numbers:");

        // Get input for three numbers
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Calculate the average of the numbers
        double average = (num1 + num2 + num3) / 3;

        // Display the average
        System.out.println("Average of the three numbers: " + average);
    }
}
