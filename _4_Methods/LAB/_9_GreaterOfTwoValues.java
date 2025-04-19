package LAB;

import java.util.Scanner;

public class _9_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String variable = scanner.nextLine();
        switch (variable){
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1, num2)); break;
            case "char":
                char char1 = scanner.next().charAt(0);
                char char2 = scanner.next().charAt(0);
                System.out.println(getMax(char1, char2)); break;
            case "string":
                String word1 = scanner.nextLine();
                String word2 = scanner.nextLine();
                System.out.println(getMax(word1, word2)); break;
        }
        scanner.close();
    }


    public static int getMax (int num1, int num2){
        return Math.max(num1, num2);
    }

    public static char getMax (char char1, char char2){
        return (char) Math.max(char1, char2);
    }

    public static String getMax (String word1, String word2){
        if (word1.compareTo(word2) > 0){
            return word1;
        } else {
            return word2;
        }
    }
}
