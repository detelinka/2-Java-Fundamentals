package EXE;

import java.util.Scanner;

public class _9_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //повтаряме: четем число -> проверка да ли е палиндром

        String input = scanner.nextLine(); //входни данни -> тескт: "123", "323", "bob", "ivan"

        while (!input.equals("END")) {

            //проверка дали е палиндром
            if (isPalindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
        scanner.close();
    }

    //метод, който проверява дали дадена дума е палиндром
    //true -> ако текстът е палинром
    //false -> ако текстът не е палиндром
    public static boolean isPalindrome (String text) {
        //палиндром: text == reversedText
        //String text - текста прочетен от ляво към дясно
        String reversedText = ""; //текста прочетен от дясно към ляво

        for (int position = text.length() - 1; position >= 0 ; position--) {
            reversedText += text.charAt(position);
        }

        return text.equals(reversedText);

    }
}
