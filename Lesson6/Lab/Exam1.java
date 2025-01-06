package Lesson6.Lab;

import java.util.Scanner;

// Ví dụ 1: Nhập username và password từ bàn phím. Nếu username = "hoidanit" và
// password > 6 ký tự thì hợp lệ
// gợi ý: sử dụng equals để so sánh; length để check chiều dài

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();
        if (username.equals("xoandev") && password.length() > 6) {
            System.out.println("Ky tu hop le");
        } else {
            System.out.println("Ky tu khong hop le");
        }
    }
}
