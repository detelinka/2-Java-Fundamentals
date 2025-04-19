package MORE_EXE;

import java.util.Scanner;

public class _3_LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input coordinates
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        // Calculate lengths
        double length1 = calculateLineLength(x1, y1, x2, y2);
        double length2 = calculateLineLength(x3, y3, x4, y4);

        if (length1 >= length2) {
            printLineInOrder(x1, y1, x2, y2);
        } else {
            printLineInOrder(x3, y3, x4, y4);
        }

        scanner.close();
    }

    public static double calculateLineLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double distanceToCenter(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    public static void printLineInOrder(int x1, int y1, int x2, int y2) {
        double distance1 = distanceToCenter(x1, y1);
        double distance2 = distanceToCenter(x2, y2);

        if (distance1 <= distance2) {
            System.out.printf("(%d, %d)(%d, %d)%n", x1, y1, x2, y2);
        } else {
            System.out.printf("(%d, %d)(%d, %d)%n", x2, y2, x1, y1);
        }
    }
}
