package LAB;

import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int m = Integer.parseInt(scanner.nextLine());
        System.out.println(mathOperations(operator, n, m));
        scanner.close();
    }
    
    private static int mathOperations(String operator, int n, int m) {
        int result = switch (operator) {
            case "+" -> n + m;
            case "-" -> n - m;
            case "*" -> n * m;
            case "/" -> n / m;
            default -> 0;
        };
        return result;
    }
}
