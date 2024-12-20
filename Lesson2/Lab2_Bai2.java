package Lesson2;

import java.util.Scanner;

public class Lab2_Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập vào số c: ");
        int c = scanner.nextInt();

        if (a == 0) {

            if (b == 0) {
                if (c == 0) {
                    System.out.println("phương trình có vô số nghiệm");
                } else {
                    System.out.println("phương trình vô nghiệm");
                }
            } else {
                double x = (double) -c / b;
                System.out.println("phương trình có nghiệm x = " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Có hai nghiệm riêng biệt: ");
                System.out.println("Nghiệm x1 =  " + x1);
                System.out.println("Nghiệm x2 =  " + x2);
            }
        }
        scanner.close();

    }
}
