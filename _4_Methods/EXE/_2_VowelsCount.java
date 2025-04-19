package EXE;

import java.util.Scanner;

public class _2_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int countVowels = getVowelsCount(text);
        System.out.println(countVowels);
        scanner.close();
    }

    public static int getVowelsCount (String text) {
        int count = 0;
      
        for (char symbol : text.toLowerCase().toCharArray()) {
            switch (symbol) {
                case 'a', 'e', 'o', 'u', 'i' -> count++;
            }
        }

        return count;
    }
}
