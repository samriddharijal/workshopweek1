package workshop1;

import java.util.Scanner;

public class qs15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer:  ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        System.out.println("\n--- Results ---");
        System.out.println("Sum:        " + a + " + " + b + " = " + (a + b));
        System.out.println("Difference: " + a + " - " + b + " = " + (a - b));
        System.out.println("Product:    " + a + " * " + b + " = " + (a * b));

        if (b != 0) {
            System.out.println("Quotient:   " + a + " / " + b + " = " + ((double) a / b));
        } else {
            System.out.println("Quotient:   Cannot divide by zero.");
        }

        scanner.close();
    }
}
