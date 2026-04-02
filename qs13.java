package workshop1;

import java.util.Scanner;

public class qs13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of items: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item:    ");
        double pricePerItem = scanner.nextDouble();

        double totalCost = quantity * pricePerItem;

        System.out.println("\nQuantity:       " + quantity);
        System.out.println("Price per item: $" + pricePerItem);
        System.out.println("Total cost:     $" + totalCost);

        scanner.close();
    }
}
