package Lesson5.Lab;

import java.util.ArrayList;
import java.util.Scanner;

// Bài 1:Nhập danh sách số thực với số lượng tùy ý từ bàn phím.Xuất ra danh sách vừa nhập và tính tổng của nó Gợi ý:sử dụng ArrayList<double>để lưu trữ

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        while (true) {
            System.out.print("Nhập một số thực: ");
            Double x = scanner.nextDouble();
            list.add(x);// Thêm số vừa nhập vào danh sách

            scanner.nextLine();
            System.out.println("Nhap Them(Y/N)?");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("N")) {
                break;
            }
        }

        // Xuất danh sách số thực đã nhập
        System.out.println("Danh sách các số thực đã nhập: " + list);

        // Tính tổng của danh sách
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i); // Cộng dồn các số vào biến sum
        }

        // Xuất tổng
        System.out.println("Tổng các số thực là: " + sum);
    }
}
