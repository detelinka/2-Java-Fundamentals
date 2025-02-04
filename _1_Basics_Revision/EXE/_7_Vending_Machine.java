package _1_Basics_Revision.EXE;

import java.util.Scanner;

public class _7_Vending_Machine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumCoins = 0.0;

        String input = scanner.nextLine();
        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2){
                sumCoins += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins); // wrong coins
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")){
            switch (product) {
                case "Nuts":
                    if (sumCoins >= 2.00){
                        System.out.println("Purchased " + product);
                        sumCoins -= 2.00;
                    } else {
                        System.out.println("Sorry, not enough money");
                    } break;

                case "Water":
                    if (sumCoins >= 0.70) {
                        System.out.println("Purchased " + product);
                        sumCoins -= 0.70;
                    }else {
                        System.out.println("Sorry, not enough money");
                    } break;

                case "Crisps":
                    if (sumCoins >= 1.50){
                        System.out.println("Purchased " + product);
                        sumCoins -= 1.50;
                    }else {
                        System.out.println("Sorry, not enough money");
                    } break;

                case "Soda":
                    if (sumCoins >= 0.80){
                        System.out.println("Purchased " + product);
                        sumCoins -= 0.80;
                    } else {
                        System.out.println("Sorry, not enough money");
                    } break;

                case "Coke":
                    if (sumCoins >= 1.00){
                        System.out.println("Purchased " + product);
                        sumCoins -= 1.00;
                    }else {
                        System.out.println("Sorry, not enough money");
                    } break;

                default: System.out.println("Invalid product"); break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}
