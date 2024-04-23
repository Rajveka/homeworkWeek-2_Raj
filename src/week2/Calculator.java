package week2;

import java.util.Scanner;


public class Calculator {
    // Instance variables
    private double operand1;
    private double operand2;

    // Constructor
    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    // Static methods
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Instance methods
    public double multiply() {
        return operand1 * operand2;
    }

    public double divide() {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN; // Not a Number
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Creating calculator object
        Calculator calculator = new Calculator(num1, num2);

        // Performing calculations
        double additionResult = add(num1, num2);
        double subtractionResult = subtract(num1, num2);
        double multiplicationResult = calculator.multiply();
        double divisionResult = calculator.divide();

        // Displaying results
        System.out.println("Addition result: " + additionResult);
        System.out.println("Subtraction result: " + subtractionResult);
        System.out.println("Multiplication result: " + multiplicationResult);
        System.out.println("Division result: " + divisionResult);

        scanner.close();
    }
}

