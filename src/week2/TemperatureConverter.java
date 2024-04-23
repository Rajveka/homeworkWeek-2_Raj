package week2;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");

        // Get the temperature input from the user
        double fahrenheit = scanner.nextDouble();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Convert Fahrenheit to Celsius
        double celsius = convertToFahrenheitToCelsius(fahrenheit);

        // Display the temperature in Celsius
        System.out.println("Temperature in Celsius: " + celsius + "°C");
    }

    // Method to convert Fahrenheit to Celsius
    public static double convertToFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

