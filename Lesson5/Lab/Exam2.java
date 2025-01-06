package Lesson5.Lab;

import java.util.ArrayList;

// 1. Tạo và in ArrayList
// Tạo một ArrayList lưu danh sách các tên học sinh.
// Thêm một số tên và in toàn bộ danh sách ra màn hình.
public class Exam2 {
    public static void main(String[] args) {
        ArrayList<String> listStudent = new ArrayList<>();
        listStudent.add("Student 1");
        listStudent.add("Student 2");
        listStudent.add("Student 3");

        System.out.println(listStudent);
    }
}
