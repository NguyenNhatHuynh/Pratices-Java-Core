package Lesson6.Pratices.Regular_Expressions;

public class CheckPassword {

    public static boolean isValidPassword(String password) {
        String regex = ".{6,}";
        return password.matches(regex);
    }

    public static void main(String[] args) {
        // Kiểm tra mật khẩu
        System.out.println("Mật khẩu hợp lệ (123456): " + isValidPassword("123456")); // true
        System.out.println("Mật khẩu hợp lệ (12345): " + isValidPassword("12345")); // false
    }
}
