package LAB;

import java.util.Scanner;

public class _3_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine()); // Input number
            printTriangle(n);
            scanner.close();
        }

    public static void printTriangle(int n) {
        Scanner scanner = new Scanner(System.in);
        // First part: increasing sequence
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line
        }

        // Second part: decreasing sequence
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
           }
            System.out.println(); // Move to the next line
                scanner.close();
        }
    }
}

