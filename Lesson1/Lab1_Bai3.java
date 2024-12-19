package Lesson1;

import java.util.Scanner;

public class Lab1_Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bàn phím cạnh của một khối lập phương: ");
        double canh = scanner.nextDouble();
        double theTich = Math.pow(canh, 3);
        System.out.println("Thể tích của khối lập phương là: " + theTich);
        scanner.close();
    }
}
