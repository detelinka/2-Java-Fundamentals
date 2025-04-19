package LAB;

import java.util.Scanner;

public class _4_Calculations {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        double num1 = Double.parseDouble(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        double result = switch (action) {
            case "add" -> num1 + num2;
            case "multiply" -> num1 * num2;
            case "subtract" -> num1 - num2;
            case "divide" -> num1 / num2;
            default -> 0;
        };
        System.out.printf("%.0f", result);
        scanner.close();
    }
}
