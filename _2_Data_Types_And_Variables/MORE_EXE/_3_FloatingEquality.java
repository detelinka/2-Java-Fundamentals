package _2_Data_Types_And_Variables.MORE_EXE;

import java.util.Scanner;

public class _3_FloatingEquality {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double eps = 0.000001;
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double num1num2 = Math.abs(num1 - num2);

        if (num1num2 < eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        scanner.close();
    } 
}
