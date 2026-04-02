package workshop1;

import java.util.Scanner;

public class qs9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount:       ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (%):   ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("\nPrincipal:       " + principal);
        System.out.println("Rate:            " + rate + "%");
        System.out.println("Time:            " + time + " year(s)");
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}
