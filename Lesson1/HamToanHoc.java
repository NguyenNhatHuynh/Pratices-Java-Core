package Lesson1;

import java.util.Scanner;

// Các hàm toán học
//https://www.w3schools.com/java/java_ref_math.asp

public class HamToanHoc {

    // Ham Kiem Tra So Be Khi Nhap Hai So
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Second Number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Min = " + Math.min(firstNumber, secondNumber));

        scanner.close();

    }

}
