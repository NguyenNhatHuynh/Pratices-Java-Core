package Lesson3;

// Bài tập 3: Tìm phần tử lớn nhất
// double[] values = {2.5, 7.8, 1.3, 9.0, 4.2};
// Yêu cầu: Tìm và in phần tử lớn nhất trong mảng.

public class Session5 {
    public static void main(String[] args) {
        double max = 0;
        double[] values = { 2.5, 11.1, 7.8, 1.3, 9.0, 4.2 };
        for (double number : values) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Number Max is : " + max);

    }
}
