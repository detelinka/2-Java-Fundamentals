package EXE;

import java.util.Scanner;

public class _4_PasswordValidator {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        //1. проверим дали дължината на паролата е валидна
        boolean isValidLength = isValidLength(password);

        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        //2. проверим дали съдържанието е валидно
        boolean isValidContent = isValidContent(password);
        if (!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        //3. проверим дали брой на цифрите е валиден
        boolean isValidCount = isValidCountDigits(password);
        if (!isValidCount) {
            System.out.println("Password must have at least 2 digits");
        }

        //4. проверяваме дали цялостно е валидна паролата
        if (isValidLength && isValidContent && isValidCount) {
            System.out.println("Password is valid");
        }
        scanner.close();
    }

    //метод, който проверява дали ми е валидна дължината на паролата
    public static boolean isValidLength (String password) {
        //валидна дължина: [6; 10]
        //невалидна дължина: < 6 или > 10
        return password.length() >= 6 && password.length() <= 10;
    }

    //метод, който проверява дали ми е валидно съдържанието на паролата
    public static boolean isValidContent (String password) {

        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        //обходили всички символи
        return true;
    }

    //метод, който проверява дали е валиден броя на цифрите в паролата
    public static boolean isValidCountDigits (String password) {
        int countDigits = 0; //брой на цифрите в паролата
        //password = "Pesho123".toCharArray()
        for (char symbol :  password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }
        return countDigits >= 2;
    }
}
