package LAB;
import java.util.Scanner;

public class _10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
    
        //12345 = 2+4 * 1+3+5 = 6*9 = 54
        System.out.println(evensTimesOdds(number));
        scanner.close();
    }
    
    public static int evensTimesOdds (int n){
        int evensSum = evensSum(n);
        int oddsSum = oddsSum(n);
    
        return evensSum * oddsSum;
    }
    
    public static int evensSum (int number) {
        if (number < 0) {
            number *= -1;
        }
        int sumEven = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            if (digit % 2 == 0) {
                sumEven += digit; // Add to even sum
            }
            number /= 10; // Remove the last digit
    
        }
        
        return sumEven;
    
    }
    public static int oddsSum (int number){
        if (number < 0) {
            number *= -1;
        }
        int sumOdd = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            if (digit % 2 == 1) {
                sumOdd += digit; // Add to even sum
            }
            number /= 10; // Remove the last digit
        }
        return sumOdd;
    
    }
}
