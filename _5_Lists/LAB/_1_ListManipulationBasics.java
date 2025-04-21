package _5_Lists.LAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt).collect(Collectors.toList()));

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] action = input.split(" ");
            int item = 0;
            int index = 0;
            switch (action[0]){
                case "Add":
                    item = Integer.parseInt(action[1]);
                    numbers.add(item); break;
                case "Remove":
                    item = Integer.parseInt(action[1]);
                    numbers.remove(Integer.valueOf(item)); break;
                case "RemoveAt":
                    index = Integer.parseInt(action[1]);
                    numbers.remove(index); break;
                case "Insert":
                    item = Integer.parseInt(action[1]);
                    index = Integer.parseInt(action[2]);
                    numbers.add(index, item); break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        scanner.close();
    }
}
