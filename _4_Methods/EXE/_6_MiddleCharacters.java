package EXE;

import java.util.Scanner;

public class _6_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleCharacter(text);
        scanner.close();
    }

    //метод, който принтира средния символ
    public static void printMiddleCharacter (String text) {
        int length = text.length(); //дължина = брой символи
        //нечетна дължина -> 1 среден символ
        if (length % 2 != 0) {

            int positionMiddleSymbol = length / 2;
            //позиция на средния символ при нечетна дължина
            System.out.println(text.charAt(positionMiddleSymbol));
        }
        //четна дължина -> 2 средни символа
        else {
            int positionFirstMiddleCharacter = length / 2 - 1; //позиция на първия среден символ
            int positionSecondMiddleCharacter = length / 2; //позиция на втория среден символ

            System.out.print(text.charAt(positionFirstMiddleCharacter));
            System.out.print(text.charAt(positionSecondMiddleCharacter));
        }
    }
}
