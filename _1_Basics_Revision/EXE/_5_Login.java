package _1_Basics_Revision.EXE;

import java.util.Scanner;

public class _5_Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the username
        String username = scanner.nextLine();

        // Reverse the username to get the password
        String password = new StringBuilder(username).reverse().toString();

        int attempts = 0;

        while (true) {
            // Input the password attempt
            String passwordAttempt = scanner.nextLine();
            attempts++;

            if (passwordAttempt.equals(password)) {
                System.out.println("User " + username + " logged in.");
                break;
            } else {
                if (attempts == 4) {
                    System.out.println("User " + username + " blocked!");
                    break;
                } else {
                    System.out.println("Incorrect password. Try again.");
                }
            }
        }

        scanner.close();
    }
}
