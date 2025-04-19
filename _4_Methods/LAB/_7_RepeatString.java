package LAB;

import java.util.Scanner;

public class _7_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int times = Integer.parseInt(scanner.nextLine());
        repeatString(times, string);
        scanner.close();
    }
    public static String repeatString (int times, String string){
        String result = "";
        for (int i = 1; i <= times ; i++) {
            System.out.print(string);
        }
        return result;
        
    }
}
