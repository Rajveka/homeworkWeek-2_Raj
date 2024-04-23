package week2;

public class DecimalToBinary {
    public static void main(String[] args) {
        // Input decimal number
        int decimal = 5;

        // Convert decimal to binary
        String binary = convertToBinary(decimal);

        // Display the binary number
        System.out.println("Binary number is: " + binary);
    }

    // Method to convert decimal to binary
    public static String convertToBinary(int decimal) {
        // Check if the decimal number is zero
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        // Temporary variable to store the remainder
        int remainder;

        // Convert decimal to binary
        while (decimal > 0) {
            // Calculate the remainder when dividing by 2
            remainder = decimal % 2;

            // Append the remainder to the binary string
            binary.append(remainder);

            // Update the decimal by dividing by 2
            decimal /= 2;
        }

        // Reverse the binary string to get the correct representation
        binary.reverse();

        return binary.toString();
    }
}

