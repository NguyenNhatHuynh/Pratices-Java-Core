package Lesson3;

import java.util.Scanner;

// Bài 1: Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số
// nguyên tố hay không?

// Gợi ý:
// - Số nguyên tố là số chỉ chia hết cho 1 và chính nó (tối đa 2 ước)
// - Dùng vòng lặp (2, Số nguyên -1). Nếu số nguyên chia hết cho i => ko là số nguyên tố
// - Sử dụng toán tử % để biết có chia hết hay không ?
public class Lab3_Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " La So Nguyen To");
        } else {
            System.out.println(number + " Khong Phai La So Nguyen To");
        }

    }

    public static boolean isPrime(int num) {
        // Số nhỏ hơn 2 không phải là số nguyên tố
        if (num < 2) {
            return false;
        }

        // Kiểm tra các số từ 2 đến căn bậc hai của num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Nếu chia hết, không phải số nguyên tố
            }
        }
        return true;
    }
}
