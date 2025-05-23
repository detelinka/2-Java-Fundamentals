package EXE;

import java.util.Scanner;

public class _1_SmallestOf3Numbers {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestNumber(firstNumber, secondNumber, thirdNumber));
    scanner.close();
    }

    //метод, който отпечатва най-малкото число
    private static int getSmallestNumber (int n1, int n2, int n3) {
        return Math.min(Math.min(n1, n2), n3);
    }
}
