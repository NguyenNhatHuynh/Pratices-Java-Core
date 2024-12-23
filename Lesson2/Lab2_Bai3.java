package Lesson2;

import java.util.Scanner;

// Bài 3: Viết chương trình tính số tiền điện (in kết quả ra console)
// Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
// - Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
// - Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500

public class Lab2_Bai3 {
    public static void main(String[] args) {
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
}
