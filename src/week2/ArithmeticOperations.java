package week2;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Input numbers
        int num1 = 125;
        int num2 = 24;

        // Calculate sum, multiplication, subtraction, division, and remainder
        int sum = num1 + num2;
        int multiply = num1 * num2;
        int subtract = num1 - num2;
        int divide = num1 / num2;
        int remainder = num1 % num2;

        // Display the results
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + subtract);
        System.out.println(num1 + " x " + num2 + " = " + multiply);
        System.out.println(num1 + " / " + num2 + " = " + divide);
        System.out.println(num1 + " mod " + num2 + " = " + remainder);
    }
}

