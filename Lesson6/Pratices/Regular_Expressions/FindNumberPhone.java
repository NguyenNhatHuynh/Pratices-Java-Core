package Lesson6.Pratices.Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumberPhone {
    public static void main(String[] args) {
        String[] input = { "0123456789", "12345678", "012-345-6789", "abcdef", "123-456-7890" };

        String regex = "\\d{10}|\\d{3}-\\d{3}-\\d{4}";

        Pattern pattern = Pattern.compile(regex);

        for (String s : input) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) {
                System.out.println(s);
            }

        }
    }
}
