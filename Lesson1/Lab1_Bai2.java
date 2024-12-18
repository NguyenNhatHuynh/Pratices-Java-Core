package Lesson1;

import java.util.Scanner;

public class Lab1_Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài của hình chữ nhật
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double width = scanner.nextDouble();

        // Nhập chiều rộng của hình chữ nhật
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double height = scanner.nextDouble();

        double perimeter = (width + height) * 2;
        System.out.println("Chu vi hình chữ nhật là: " + perimeter);

        double area = width + height;
        System.out.println("Diện tích hình chữ nhật là: " + area);

        double smallestEdge = Math.min(width, height);
        System.out.println("Cạnh nhỏ nhất: " + smallestEdge);

    }
}
