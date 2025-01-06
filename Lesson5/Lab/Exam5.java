package Lesson5.Lab;

import java.util.ArrayList;

// Kiểm tra phần tử
// Tạo một ArrayList lưu danh sách các thành phố.
// Kiểm tra xem "Hà Nội" có trong danh sách không.
// Gợi ý: Sử dụng contains(value) để kiểm tra.

public class Exam5 {
    public static void main(String[] args) {
        ArrayList<String> listCity = new ArrayList<String>();
        listCity.add("BEN");
        listCity.add("null");
        listCity.add("Hà Nội");

        System.out.println(listCity.contains("Hà Nội"));
    }
}
