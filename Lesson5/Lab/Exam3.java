package Lesson5.Lab;

import java.util.ArrayList;

// 2. Truy cập phần tử
// Tạo một ArrayList lưu danh sách số nguyên.
// Thêm các số từ 1 đến 5 và in phần tử ở vị trí thứ 2.
// Gợi ý: Sử dụng get(index) để truy cập phần tử.

public class Exam3 {
    public static void main(String[] args) {
        ArrayList<Integer> listInteger = new ArrayList<>();

        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println(listInteger.get(2));

    }
}
