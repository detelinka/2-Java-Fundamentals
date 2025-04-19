package LAB;

import java.util.Scanner;

public class _6_CalculateRectangleArea {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.0f", area(a,b));
        scanner.close();
    }
    public static double area (double width, double length){
        double area = width * length;
        return area;
    }
}
