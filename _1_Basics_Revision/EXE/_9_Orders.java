package _1_Basics_Revision.EXE;

import java.util.Scanner;

public class _9_Orders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOrders = Integer.parseInt(scanner.nextLine());
        double total = 0.0;
        double orderPrice = 0.0;

        for (int i = 1; i <= countOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules =Integer.parseInt(scanner.nextLine());

            orderPrice = pricePerCapsule * days * countCapsules;
            total += orderPrice;

            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
        }

        System.out.printf("Total: $%.2f",total);
    }
}
