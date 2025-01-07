package Lesson6.Lab.Exam2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Students with names starting with 'Nguyễn':\"");
        ArrayList<Student> listStudent = new ArrayList<>();

        listStudent.add(new Student("1", "Nguyễn Nhật Nam"));
        listStudent.add(new Student("2", "Trần vĩ hào"));
        listStudent.add(new Student("4", "Nam văn tước"));
        listStudent.add(new Student("4", "Nam văn tước"));
        listStudent.add(new Student("5", "Nguyễn Châu"));
        for (Student student : listStudent) {
            if (student.getName().startsWith("Nguyễn")) {
                System.out.println(student.displayStudent());
            }
        }
    }
}
