package EXE;

import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualSums {
        public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        // 1. Вземаме всяко едно число от масива
        for (int position = 0; position <= numbers.length - 1; position++) {

            // 2 - проверяваме дали сумата на числата в ляво е равна на сумата на числата в дясно
            int leftSum = 0;
            int rightSum = 0;

            // Обхождам всички числа в ляво:
            for (int leftPosition = 0; leftPosition < position; leftPosition++) {
                leftSum += numbers[leftPosition];
            }

            // Обхождам всички числа в дясно:
            for (int rightPosition = position + 1; rightPosition <= numbers.length - 1; rightPosition++) {
                rightSum += numbers[rightPosition];
            }

            if (leftSum == rightSum) {
                System.out.println(position);
                return;
            }
        }

        System.out.println("no");
        }
    }
}
