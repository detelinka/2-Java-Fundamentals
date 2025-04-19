package LAB;
import java.util.Scanner;

public class _1_SignOfIntegernumbers {
    public static void main(String[] args) {
        printSignOfNumber();

    }

    public static void printSignOfNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 0){
            System.out.printf("The number %d is positive.", number);
        } else if (number == 0){
            System.out.printf("The number %d is zero.", number);
        } else {
            System.out.printf("The number %d is negative.", number);
        }
        scanner.close();
    }
}
