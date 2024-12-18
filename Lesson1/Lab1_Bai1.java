package Lesson1;

import java.util.Scanner;

// Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
// In ra màn hình với định dạng:
public class Lab1_Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your Score: ");
        int score = scanner.nextInt();

        System.out.println("Your name is: " + name);
        System.out.println("Your Score is: " + score);

        scanner.close();
    }
}
