package Lesson2;

import java.util.Scanner;

public class Lab2_Bai4 {

    public static void bai1() {
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

    public static void bai2() {
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

    public static void bai3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhap vao So Dien: ");
        double soDien = scanner.nextDouble();
        if (soDien <= 100) {
            double tienDien = soDien * 10000;
            System.out.println("Tien Dien Thang Nay la: " + tienDien);
        } else {
            double tienDien = 100 * 1000 + (soDien - 100) * 1500;
            System.out.println("Tien Dien Thang Nay la: " + tienDien);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Future: ");
        int enterFuture = scanner.nextInt();

        switch (enterFuture) {
            case 1:
                // giải phương trình bậc nhất
                bai1();
                break;
            case 2:
                // giải phương trình bậc hai
                bai2();
                break;
            case 3:
                // tính tiền điện
                bai3();
                break;

            default:
                System.out.println(">> Bạn đã thoát chương trình <<");
                System.exit(0);
        }
    }
}
