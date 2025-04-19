package EXE;

import java.util.Scanner;

public class _7_NxNMatrix {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // брой редове = брой колони
        printMatrix(n);
        scanner.close();
    }
    
    //метод, който отпечатва матрица с редове = колони = n
    private static void printMatrix (int n) {
        for (int row = 1; row <= n; row++) { //всички редове
            for (int col = 1; col <= n; col++) { //всички колони
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
