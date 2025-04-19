package MORE_EXE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _6_ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();

        String input;
        while (!(input = scanner.nextLine()).equals("end")) {
            String[] parts = input.split(" ");
            String command = parts[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(parts[1]);
                    if (index < 0 || index >= numbers.length) {
                        System.out.println("Invalid index");
                    } else {
                        numbers = exchange(numbers, index);
                    }
                    break;
                case "max":
                case "min":
                    String type = parts[1];
                    boolean isMax = command.equals("max");
                    int resultIndex = findMinMaxIndex(numbers, type, isMax);
                    if (resultIndex == -1) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(resultIndex);
                    }
                    break;
                case "first":
                case "last":
                    int count = Integer.parseInt(parts[1]);
                    String evenOdd = parts[2];
                    if (count > numbers.length) {
                        System.out.println("Invalid count");
                    } else {
                        int[] result = command.equals("first") 
                            ? findFirst(numbers, count, evenOdd)
                            : findLast(numbers, count, evenOdd);
                        System.out.println(Arrays.toString(result));
                    }
                    break;
            }
        }

        // Final output
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }

    public static int[] exchange(int[] array, int index) {
        int[] result = new int[array.length];
        int pos = 0;
        for (int i = index + 1; i < array.length; i++) {
            result[pos++] = array[i];
        }
        for (int i = 0; i <= index; i++) {
            result[pos++] = array[i];
        }
        return result;
    }

    public static int findMinMaxIndex(int[] array, String type, boolean isMax) {
        int index = -1;
        int bestValue = isMax ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            boolean isEven = array[i] % 2 == 0;
            if ((type.equals("even") && isEven) || (type.equals("odd") && !isEven)) {
                if ((isMax && array[i] >= bestValue) || (!isMax && array[i] <= bestValue)) {
                    bestValue = array[i];
                    index = i;
                }
            }
        }
        return index;
    }

    public static int[] findFirst(int[] array, int count, String type) {
        List<Integer> result = new ArrayList<>();
        for (int num : array) {
            boolean isEven = num % 2 == 0;
            if ((type.equals("even") && isEven) || (type.equals("odd") && !isEven)) {
                result.add(num);
                if (result.size() == count) break;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] findLast(int[] array, int count, String type) {
        List<Integer> result = new ArrayList<>();
        for (int i = array.length - 1; i >= 0; i--) {
            boolean isEven = array[i] % 2 == 0;
            if ((type.equals("even") && isEven) || (type.equals("odd") && !isEven)) {
                result.add(array[i]);
                if (result.size() == count) break;
            }
        }
        Collections.reverse(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
