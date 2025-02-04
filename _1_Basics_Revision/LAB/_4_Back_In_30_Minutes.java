package _1_Basics_Revision.LAB;

import java.util.Scanner;

public class _4_Back_In_30_Minutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hours * 60 + minutes) + 30;    //Превръщаме всичко в минути и добавяме 15

        //Пресмятаме времето - часове : минути
        int newHours = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        if (newHours >= 24){
            newHours = 0;
            System.out.printf("%d:%02d", newHours, newMinutes);
        } else{
            System.out.printf("%d:%02d", newHours, newMinutes);
        }
    }
}
