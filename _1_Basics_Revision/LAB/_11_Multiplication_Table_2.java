package _1_Basics_Revision.LAB;

import java.util.Scanner;

public class _11_Multiplication_Table_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num2; i <= 10; i++) {
            int result = num1 * i;
            System.out.printf("%d X %d = %d%n",num1, i, result);
        }
    }
}
