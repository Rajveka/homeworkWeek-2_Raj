package week2;

public class StaticVariablesExample {
    // 2.1 Declare two static variables
    private static int num1 = 10;
    private static String str = "Hello";

    // 2.2 Declare one static method
    public static void printVariables() {
        // 2.3 Call both static variables into the static method inside the print statement
        System.out.println("Value of num1: " + num1);
        System.out.println("Value of str: " + str);
    }

    // 2.4 Declare the Main method
    public static void main(String[] args) {
        // 2.5 Call the static method into the Main method and Run the programme
        printVariables();
    }
}

