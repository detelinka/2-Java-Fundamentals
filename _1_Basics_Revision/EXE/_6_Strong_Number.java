package _1_Basics_Revision.EXE;

import java.util.Scanner;

public class _6_Strong_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number; // пазим стойността на въведеното число
        int sumFactDigit = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            int fact = 1; // factorial of lastDigit

            //todo: factorial of last digit
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }

            sumFactDigit += fact;
            number = number /10;
        }
        if (startNumber == sumFactDigit){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
