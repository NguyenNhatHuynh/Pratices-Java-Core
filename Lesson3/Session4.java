package Lesson3;

// Bài tập 1: Tổng các số trong mảng
// int[] numbers = {1, 2, 3, 4, 5};
// Yêu cầu: Tính tổng các số trong mảng và in ra màn hình.

public class Session4 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println(total);
    }
}
