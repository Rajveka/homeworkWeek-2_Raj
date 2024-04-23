package week2;

public class SwapVariables {
    public static void main(String[] args) {
        // Define and initialize the variables
        int a = 10;
        int b = 20;

        // Display the values of variables before swapping
        System.out.println("Before swapping:");
        System.out.println("First variable (a) = " + a);
        System.out.println("Second variable (b) = " + b);

        // Swap the values of variables without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Display the values of variables after swapping
        System.out.println("\nAfter swapping:");
        System.out.println("First variable (a) = " + a);
        System.out.println("Second variable (b) = " + b);
    }
}

