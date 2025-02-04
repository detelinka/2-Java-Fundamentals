package _1_Basics_Revision.EXE;

import java.util.Scanner;

public class _4_Print_and_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = a; i <= b ; i++) {
            sum += i;
            System.out.printf("%d ", i);
        }
        System.out.printf("%nSum: %d", sum);
    }
}
