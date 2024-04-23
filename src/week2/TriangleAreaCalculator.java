package week2;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Calculate the area of the triangle
        double area = calculateTriangleArea(base, height);

        // Display the area of the triangle
        System.out.println("The area of the triangle is: " + area);
    }

    // Method to calculate the area of the triangle
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }
}

