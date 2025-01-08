package Lesson6.Pratices.Regular_Expressions;

public class CheckEmail {
    public static boolean isValidEmail(String email) {
        String regex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    public static void main(String[] args) {
        // Kiểm tra email
        System.out.println("Email hợp lệ (xoandev163@gmail.com.vn): " + isValidEmail("xoandev163@gmail.com.vn")); // true
        System.out.println("Email hợp lệ (abc#blabla): " + isValidEmail("abc#blabla")); // false
    }
}
