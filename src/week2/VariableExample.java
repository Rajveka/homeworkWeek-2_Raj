package week2;

public class VariableExample {
    // 4.1 Declare two instance and two static variables
    private int instanceVar1 = 10;
    private int instanceVar2 = 20;
    private static String staticVar1 = "Hello";
    private static String staticVar2 = "World";

    // 4.2 Declare one instance method
    public void instanceMethod() {
        // 4.4 Call all four instance and static variables into the instance method inside the print statement
        System.out.println("Instance method - Value of instanceVar1: " + instanceVar1);
        System.out.println("Instance method - Value of instanceVar2: " + instanceVar2);
        System.out.println("Instance method - Value of staticVar1: " + staticVar1);
        System.out.println("Instance method - Value of staticVar2: " + staticVar2);
    }

    // 4.3 Declare one static method
    public static void staticMethod() {
        // 4.4 Call all four instance and static variables into the static method inside the print statement
        VariableExample example = new VariableExample();
        System.out.println("Static method - Value of instanceVar1: " + example.instanceVar1);
        System.out.println("Static method - Value of instanceVar2: " + example.instanceVar2);
        System.out.println("Static method - Value of staticVar1: " + staticVar1);
        System.out.println("Static method - Value of staticVar2: " + staticVar2);
    }

    // 4.5 Declare the Main method
    public static void main(String[] args) {
        // 4.6 Call both instance and static methods into the Main method and run the programme
        VariableExample example = new VariableExample();
        example.instanceMethod();
        staticMethod();
    }
}

