package Lesson2;

import java.util.Scanner;

// Bài tập: Viết chương trình tính thuế
// - dưới 10M: không đóng thuế
// - từ 10M tới 15M: thuế 10%
// - từ 15 tới 30M : thuế 20%
// - trên 30M: thuế 50%
// Ap dung If else
public class Sesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Nhập vào tiền lương: ");
        int tienLuong = scanner.nextInt();

        if (tienLuong < 10000000) {
            System.out.println("Bạn không cần đống thuế");
        } else if (tienLuong >= 10000000 && tienLuong <= 15000000) {
            double thue = tienLuong * 0.10;
            System.out.println("Thuế cần đóng là: " + thue + " Triệu đồng (Thuế 10%)");
        } else if (tienLuong >= 15000000 && tienLuong <= 30000000) {
            double thue = tienLuong * 0.20;
            System.out.println("Thuế cần đóng là: " + thue + " Triệu đồng (Thuế 20%)");
        } else {
            double thue = tienLuong * 0.50;
            System.out.println("Thuế cần đóng là: " + thue + " Triệu đồng (Thuế 50%)");
        }

        scanner.close();
    }
}
