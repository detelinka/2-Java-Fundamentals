package MORE_EXE;

import java.util.Scanner;

public class _5_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double num3 = Double.parseDouble(scanner.nextLine());

        printSign(num1, num2, num3);

        scanner.close();
    }

    public static void printSign(double num1, double num2, double num3) {
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
            return;
        }

        int negativeCount = 0;
        if (num1 < 0) negativeCount++;
        if (num2 < 0) negativeCount++;
        if (num3 < 0) negativeCount++;

        if (negativeCount % 2 == 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
