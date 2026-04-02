package workshop1;

import java.util.Scanner;

public class qs14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in US Dollars: $");
        double amountUSD = scanner.nextDouble();

        System.out.print("Enter the exchange rate (e.g., rupees per 1 USD): ");
        double exchangeRate = scanner.nextDouble();

        double convertedAmount = amountUSD * exchangeRate;

        System.out.println("\nAmount in USD:    $" + amountUSD);
        System.out.println("Exchange Rate:    " + exchangeRate);
        System.out.println("Converted Amount: " + convertedAmount);

        scanner.close();
    }
}
