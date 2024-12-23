package Pratices;

import java.util.Scanner;

public class Sesstion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.err.println("Monday");
                break;
            case 2:
                System.err.println("Tuesday");
                break;
            case 3:
                System.err.println("Wednesday");
                break;
            case 4:
                System.err.println("Thursday");
                break;
            case 5:
                System.err.println("Friday");
                break;
            case 6:
                System.err.println("Saturday");
                break;
            case 7:
                System.err.println("Sunday");
                break;

            default:
                System.err.println("Day is Uncorrect");
                break;
        }
    }
}
