package LAB;

import java.util.Scanner;

public class _1_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        String[] days = {"Monday", "Tuesday", "Wednesday"
        , "Thursday", "Friday", "Saturday", "Sunday"};

        if (num >= 1 && num <= 7){
            System.out.println(days[num - 1]);
        } else {
            System.out.println("Invalid day!");
        }
        scanner.close();
    }
}
