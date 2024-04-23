package week2;

public class InstanceVariablesExample {
    // 1.1 Declare two instance variables
    private int num1 = 10;
    private String str = "Hello";

    // 1.2 Declare one instance method
    public void printVariables() {
        // 1.3 Call both instance variables into the instance method inside the print statement
        System.out.println("Value of num1: " + num1);
        System.out.println("Value of str: " + str);
    }

    // 1.4 Declare the Main method
    public static void main(String[] args) {
        // 1.5 Call the above instance method into the Main method and Run the programme
        InstanceVariablesExample example = new InstanceVariablesExample();
        example.printVariables();
    }
}

