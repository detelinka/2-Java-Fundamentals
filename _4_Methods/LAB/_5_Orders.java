package LAB;

import java.util.Scanner;

public class _5_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        priceForProducts(product, quantity);
        scanner.close();
    }

    private static void priceForProducts(String product, int quantity) {

        double price = switch (product) {
            case "coffee" -> 1.50 * quantity;
            case "water" -> 1.00 * quantity;
            case "coke" -> 1.40 * quantity;
            case "snacks" -> 2.0 * quantity;
            default -> 0.0;
        };
        System.out.printf("%.2f", price);
    }
}
