package LAB;

import java.util.Scanner;

public class _8_MathPower {
    public static void main(String[] args) {

        System.out.printf("%.0f", numPower());
    }

    private static double numPower() {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        double result = Math.pow(a, b);
        scanner.close();
        return result;
    }
}
