package MORE_EXE;

import java.util.Scanner;

public class _2_CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input coordinates
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        // Print the closer point
        printClosestPointToCenter(x1, y1, x2, y2);

        scanner.close();
    }

    public static void printClosestPointToCenter(int x1, int y1, int x2, int y2) {
        double distance1 = Math.sqrt(x1 * x1 + y1 * y1);
        double distance2 = Math.sqrt(x2 * x2 + y2 * y2);

        if (distance1 <= distance2) {
            System.out.printf("(%d, %d)%n", x1, y1);
        } else {
            System.out.printf("(%d, %d)%n", x2, y2);
        }
    }
}
