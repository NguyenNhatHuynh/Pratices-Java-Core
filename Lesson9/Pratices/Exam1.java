package Lesson9.Pratices;

import java.util.Scanner;

// Bài toán:
// Cho user nhập input từ bàn phím, và thực hiện phép chia : 10/x (với x nhập từ bàn phím)
// Nếu nhập vào "ký tự" (ví dụ a,b, c...) hoặc nhập vào số 0, chương trình sẽ báo lỗi và
// "dừng lại".

// Làm sao để:
// - khi nhập vào ký tự ko hợp lệ, chương trình báo lỗi và "tiếp tục chạy"
// - User tiếp tục nhập input cho tới khi hợp lệ

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isInput = false;
        while (!isInput) {
            try {
                System.out.println("Enter number: ");
                String input = scanner.nextLine();
                int x = Integer.parseInt(input);

                if (x == 0) {
                    throw new ArithmeticException("Không thể chia cho 0!");
                }

                // Thực hiện phép chia
                double result = 10.0 / x;
                System.out.println("Kết quả: 10 / " + x + " = " + result);
                isInput = true; // Đầu vào hợp lệ, thoát khỏi vòng lặp
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ!");
            } catch (ArithmeticException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }

        System.out.println("Chương trình kết thúc.");
        scanner.close();
    }
}
