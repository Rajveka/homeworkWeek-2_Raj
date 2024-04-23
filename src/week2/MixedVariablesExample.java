package week2;

public class MixedVariablesExample {
    // 3.1 Declare one instance and one static variable
    private int instanceVar = 10;
    private static String staticVar = "Hello";

    // 3.2 Declare one instance method
    public void instanceMethod() {
        // 3.4 Call both instance and static variables into the instance method inside the print statement
        System.out.println("Instance method - Value of instanceVar: " + instanceVar);
        System.out.println("Instance method - Value of staticVar: " + staticVar);
    }

    // 3.3 Declare one static method
    public static void staticMethod() {
        // 3.4 Call both instance and static variables into the static method inside the print statement
        MixedVariablesExample example = new MixedVariablesExample();
        System.out.println("Static method - Value of instanceVar: " + example.instanceVar);
        System.out.println("Static method - Value of staticVar: " + staticVar);
    }

    // 3.5 Declare the Main method
    public static void main(String[] args) {
        // 3.6 Call both instance and static methods into the Main method and run the programme
        MixedVariablesExample example = new MixedVariablesExample();
        example.instanceMethod();
        staticMethod();
    }
}

