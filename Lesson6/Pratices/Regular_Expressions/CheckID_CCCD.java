package Lesson6.Pratices.Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckID_CCCD {

    public static boolean isValidCCCD(String cccd) {
        String regex = "\\d{12}";

        return cccd.matches(regex);
    }

    public static void main(String[] args) {
        // Các ví dụ kiểm tra
        String cccd1 = "099145697413"; // Hợp lệ
        String cccd2 = "09914569741a"; // Không hợp lệ
        String cccd3 = "09914569741"; // Không hợp lệ (chỉ 11 ký tự)
        String cccd4 = "0991456974135"; // Không hợp lệ (13 ký tự)

        System.out.println("CCCD1 is valid: " + isValidCCCD(cccd1));
        System.out.println("CCCD2 is valid: " + isValidCCCD(cccd2));
        System.out.println("CCCD3 is valid: " + isValidCCCD(cccd3));
        System.out.println("CCCD4 is valid: " + isValidCCCD(cccd4));

    }
}
