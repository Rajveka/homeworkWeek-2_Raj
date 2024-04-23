package week2;

public class CornerStorePrinter {
    public static void main(String[] args) {
        // Print the top border
        System.out.println("+------------------------+");

        // Print the content
        System.out.println("|                        |"); // Empty line
        System.out.println("|      CORNER STORE      |"); // Store name
        System.out.println("|                        |"); // Empty line
        System.out.println("|  2015-03-29 04:38PM    |"); // Date and time
        System.out.println("|                        |"); // Empty line
        System.out.println("|  Gallons: 10.870       |"); // Gallons purchased
        System.out.println("|  Price/gallon: $ 2.089 |"); // Price per gallon
        System.out.println("|                        |"); // Empty line
        System.out.println("|  Fuel total: $ 22.71   |"); // Total cost
        System.out.println("|                        |"); // Empty line

        // Print the bottom border
        System.out.println("+------------------------+");
    }
}

