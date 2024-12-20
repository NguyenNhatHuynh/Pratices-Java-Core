package Lesson2;

import java.util.Scanner;

// Bài 1: Cho phương trình ax + b = 0
// Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
// trên

public class Lab2_Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("phương trình có vô số nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x: " + x);
        }
        scanner.close();

    }
}
