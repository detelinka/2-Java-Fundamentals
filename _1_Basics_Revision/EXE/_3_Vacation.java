package _1_Basics_Revision.EXE;

import java.util.Scanner;

public class _3_Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0.0;

        switch (typeGroup){
            case "Students":
                totalPrice = switch (day) {
                    case "Friday" -> 8.45 * countPeople;
                    case "Saturday" -> 9.80 * countPeople;
                    case "Sunday" -> 10.46 * countPeople;
                    default -> totalPrice;
                };

                if (countPeople >= 30){
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Business":
                totalPrice = switch (day) {
                    case "Friday" -> 10.90 * countPeople;
                    case "Saturday" -> 15.60 * countPeople;
                    case "Sunday" -> 16 * countPeople;
                    default -> totalPrice;
                };

                if (countPeople >= 100){
                    totalPrice = totalPrice - (totalPrice / countPeople * 10);
                } break;
            case "Regular":
                totalPrice = switch (day) {
                    case "Friday" -> 15 * countPeople;
                    case "Saturday" -> 20 * countPeople;
                    case "Sunday" -> 22.50 * countPeople;
                    default -> totalPrice;
                };
                if (countPeople >= 10 && countPeople <= 20){
                    totalPrice = totalPrice * 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice );
    }
}
