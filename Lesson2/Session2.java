package Lesson2;

import java.util.Scanner;

// Bài tập: Viết chương trình tính thuế
// - dưới 10M: không đóng thuế
// - từ 10M tới 15M: thuế 10%
// - từ 15 tới 30M : thuế 20%
// - trên 30M: thuế 50%
// Ap dung Switch

public class Session2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Nhập vào tiền lương: ");
        int tienLuong = scanner.nextInt();

        // switch (tienLuong) {
        // case :

        // break;

        // default:
        // break;
        // }

        scanner.close();
    }
}
