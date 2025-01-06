package Lesson5.Lab;

import java.util.ArrayList;

// 3. Cập nhật phần tử
// Tạo một ArrayList lưu danh sách các môn học.
// Cập nhật tên môn học ở vị trí thứ 1 thành "Mathematics".
// Gợi ý: Sử dụng set(index, value) để cập nhật.

public class Exam4 {
    public static void main(String[] args) {
        ArrayList<String> listSubject = new ArrayList<>();
        listSubject.add("api");
        listSubject.add("null");
        listSubject.set(1, "Mathematics");

        System.out.println(listSubject);

    }
}
