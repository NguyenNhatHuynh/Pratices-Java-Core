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
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. Cộng |");
        System.out.println("| 2. Trừ |");
        System.out.println("| 3. Nhân |");
        System.out.println("| 4. Chia |");
        System.out.println("| 5. Chia lấy dư |");
        System.out.println("| 6. Kết thúc |");
        System.out.println("++ ------------------ ++");
        System.err.println("Nhập vào phép toán mà bạn cần tính: ");
        int phepToan = scanner.nextInt();

        switch (phepToan) {
            case 1:
                System.out.println("Bạn đã lựa chọn phép cộng");
                break;
            case 2:
                System.out.println("Bạn đã lựa chọn phép trừ");
                break;
            case 3:
                System.out.println("Bạn đã lựa chọn phép nhân");
                break;
            case 4:
                System.out.println("Bạn đã lựa chọn phép chia");
                break;
            case 5:
                System.out.println("Bạn đã lựa chọn phép chia lấy dư %");
                break;
            default:
                System.out.println("Bạn đã lựa chọn thoát chương trình");
                System.exit(0);
        }

        scanner.close();
    }
}
