package week2;

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");

        // Get the radius input from the user
        double radius = scanner.nextDouble();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Calculate the area of the circle
        double area = calculateCircleArea(radius);

        // Display the area of the circle
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    // Method to calculate the area of the circle
    public static double calculateCircleArea(double radius) {
        // Define the value of Pi
        final double PI = 3.14159;

        // Calculate the area using the formula A = PI * r^2
        double area = PI * radius * radius;

        // Return the calculated area
        return area;
    }
}
