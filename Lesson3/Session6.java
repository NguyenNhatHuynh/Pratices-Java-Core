package Lesson3;

// To demonstrate a practical example of using arrays, let's create a program that calculates the average of different ages:
// Để minh họa một ví dụ thực tế về việc sử dụng mảng, hãy tạo một chương trình tính trung bình của các độ tuổi khác nhau:
public class Session6 {
    public static void main(String[] args) {
        // An array storing different ages
        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

        float avg, sum = 0;

        int length = ages.length;

        for (int age : ages) {
            sum += age;
        }

        avg = sum / length;

        System.out.println("The average age is: " + avg);

    }
}
