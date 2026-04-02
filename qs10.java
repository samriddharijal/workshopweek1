package workshop1;

import java.util.Scanner;

public class qs10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer:  ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("\n--- Results ---");
        System.out.println("Addition:       " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraction:    " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division:       " + num1 + " / " + num2 + " = " + ((double) num1 / num2));
        } else {
            System.out.println("Division:       Cannot divide by zero.");
        }

        scanner.close();
    }
}
