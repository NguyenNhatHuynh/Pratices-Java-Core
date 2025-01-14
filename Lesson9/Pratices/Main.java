package Lesson9.Pratices;

// Ví dụ 1: Xử lý ngoại lệ với ArithmeticException
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Chia cho 0 sẽ gây ra ArithmeticException
            System.out.println("Ket qua: " + result);
        } catch (Exception e) {
            System.out.println("Lỗi: Không thể chia cho 0!");
        }
    }
}
