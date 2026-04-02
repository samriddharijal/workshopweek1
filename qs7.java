package workshop1;

import java.util.Scanner;

public class qs7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        System.out.println("\nCelsius:    " + celsius + " C");
        System.out.println("Fahrenheit: " + fahrenheit + " F");

        scanner.close();
    }
}
