package Lesson3;

import java.util.Scanner;

// Chương trình đếm ngược sử dụng vòng lặp while
// To demonstrate a practical example of the while loop, we have created a simple "countdown" program:
public class Sesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int countdown = scanner.nextInt();

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year!!");
    }
}
