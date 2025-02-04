package _1_Basics_Revision.LAB;

import java.util.Scanner;

public class _2_Passed {
// Write a program that takes as an input a grade and prints "Passed!" if the grade is equal or more than 3.00.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 3.00){
                System.out.println("Passed!");
            }
        }
    }

