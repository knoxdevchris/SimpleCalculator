import java.util.Scanner;

public class Calculator {
    // method to add two numbers
    public int add(int x, int y) {
        return x + y;
    }

    // method to multiply two numbers
    public int multiply(int x, int y) {
        return x * y;
    }

    // method to subtract two numbers
    public int subtract(int x, int y) {
        return x - y;
    }

    // method to divide two numbers
    public double divide(int x, int y) {
        // Return a double for precision and handle division by zero
        if (y != 0) {
            return (double) x / y;
        } else {
            System.out.println("Error: Division by zero is undefined.");
            return 0; // Return 0 or some error value
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Create a Calculator object
        Calculator calc = new Calculator();

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();  // Read the first number

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();  // Read the second number

        // Call the add, multiply, subtract, and divide methods with user input
        int sum = calc.add(num1, num2);
        int product = calc.multiply(num1, num2);
        int difference = calc.subtract(num1, num2);
        double quotient = calc.divide(num1, num2);

        // Output the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);

        // Close the Scanner
        sc.close();
    }
}
