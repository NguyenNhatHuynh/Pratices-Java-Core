package Lesson9.Pratices;

public class Main2 {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        } finally {
            System.out.println("Khối finally luôn được thực thi!");
        }
    }
}
