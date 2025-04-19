package MORE_EXE;

import java.util.Scanner;

public class _1_DataTypes {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first line to determine the data type
        String dataType = scanner.nextLine();

        switch (dataType.toLowerCase()) {
            case "int":
                int intValue = Integer.parseInt(scanner.nextLine());
                System.out.println(intValue * 2);
                break;
            case "real":
                double doubleValue = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f%n", doubleValue * 1.5);
                break;
            case "string":
                String stringValue = scanner.nextLine();
                System.out.println("$" + stringValue + "$");
                break;
        }

        scanner.close();
    }
}
