package _1_Basics_Revision.EXE;

import java.util.Scanner;

public class _8_Triangle_of_Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
    }
}
