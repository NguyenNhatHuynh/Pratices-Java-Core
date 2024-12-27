package Lesson3;

import java.util.Scanner;

// Bài 3: Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:

// - Sắp xếp và xuất mảng vừa nhập ra màn hình
// - Xuất phần tử có giá trị nhỏ nhất
// - Xuất phần tử có giá trị lớn nhấ
public class Lab3_Bai3 {
    public static void main(String[] args) {
        // ============= Đoạn mã này dùng để khởi tạo ===================
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arrayNumbers = new int[n];

        // ============= Đoạn mã này dùng để nhập phần tử trong mảng ===================

        System.out.print("Nhap cac phan tu cua mang:");
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            arrayNumbers[i] = scanner.nextInt();
        }

        // ============= Đoạn mã này dùng đễ sắp xếp các phần tử (tăng dần)
        // ===================
        for (int i = 0; i < arrayNumbers.length - 1; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] > arrayNumbers[j]) {
                    int temp = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[j];
                    arrayNumbers[j] = temp;
                }
            }
        }

        // ============== Đoạn code này dùng để In ra mảng vừa nhập (để kiểm tra)
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(arrayNumbers[i] + " ");
        }
        System.out.println(" ");
        // ============= Đoạn mã này dùng đễ sắp xếp các phần tử ( giảm dần)
        for (int i = 0; i < arrayNumbers.length - 1; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] < arrayNumbers[j]) {
                    int temp = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[j];
                    arrayNumbers[j] = temp;
                }
            }
        }

        // ============== Đoạn code này dùng để In ra mảng vừa nhập (để kiểm tra)
        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(arrayNumbers[i] + " ");
        }
        System.out.println(" ");

        // ======= Đọan mã này dùng để Xuất Phần tử có giá trị nhỏ nhất
        int min = 0;
        for (int i = 0; i < arrayNumbers.length - 1; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                min = Math.min(arrayNumbers[i], arrayNumbers[j]);
            }
        }
        System.out.println("So nho nhat trong mang la: " + min);

        // ======= Đọan mã này dùng để Xuất Phần tử có giá trị lớn nhất
        int max = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > max) {
                max = arrayNumbers[i];
            }
        }
        System.out.println("So lon nhat trong mang la: " + max);

        scanner.close();
    }
}
