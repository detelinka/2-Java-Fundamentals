package EXE;

import java.util.Scanner;

public class _5_AddAndSubtract {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(calculate(firstNumber, secondNumber, thirdNumber));
        scanner.close();
    }

    //метод, който прави калкулации
    public static int calculate (int n1, int n2, int n3) {
        return (n1 + n2) - n3;
    }


}
