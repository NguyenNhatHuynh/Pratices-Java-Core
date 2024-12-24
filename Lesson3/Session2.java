package Lesson3;

// To demonstrate a practical example of the while loop combined with an if else statement, let's say we play a game of Yatzy:
// Để minh họa một ví dụ thực tế về vòng lặp while kết hợp với câu lệnh if else, giả sử chúng ta chơi trò chơi Yatzy:
public class Session2 {
    public static void main(String[] args) {
        int dice = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }
    }
}
