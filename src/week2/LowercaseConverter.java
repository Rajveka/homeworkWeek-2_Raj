package week2;

public class LowercaseConverter {
    public static void main(String[] args) {
        // Input string
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";

        // Convert the string to lowercase
        String lowercase = convertToLowerCase(input);

        // Display the lowercase string
        System.out.println("Output: " + lowercase);
    }

    // Method to convert a string to lowercase
    public static String convertToLowerCase(String input) {
        // Use the toLowerCase() method of the String class to convert the string to lowercase
        return input.toLowerCase();
    }
}
