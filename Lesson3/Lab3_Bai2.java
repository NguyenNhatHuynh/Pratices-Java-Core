package Lesson3;

import java.util.Scanner;

// Bai 2 : Viet Bang cuu chuong cua 1 so nguyen
public class Lab3_Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên
        System.out.print(" Nhập số nguyên: ");
        int x = scanner.nextInt();

        // In bảng cửu chương
        System.out.println("Bảng cửu chương của " + x + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", x, i, x * i);
        }
        scanner.close();
    }

}
