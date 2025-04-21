package _5_Lists.LAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>(Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList()));

        for (int i = 0; i < numberList.size() / 2; i++) {
            int first = numberList.get(i);
            int second = numberList.get(numberList.size() - 1 - i);
            numberList.set(i, first + second);
        }
        if (numberList.size() % 2 != 0) {
            numberList = numberList.subList(0, (numberList.size() / 2) + 1);
        } else {
            numberList = numberList.subList(0, numberList.size() / 2);
        }
        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
        scanner.close();
    }
}