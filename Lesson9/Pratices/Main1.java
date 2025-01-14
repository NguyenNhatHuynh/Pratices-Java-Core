package Lesson9.Pratices;

// Ví dụ 2: Xử lý ngoại lệ nhiều loại (Multiple Catch)
public class Main1 {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[5]); // Ngoại lệ ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Lỗi toán học: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi chỉ mục mảng: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi khác: " + e.getMessage());
        }
    }
}
