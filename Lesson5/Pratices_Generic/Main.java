package Lesson5.Pratices_Generic;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Pair với Integer
        Pair<Integer, Integer> pair1 = new Pair<>(10, 20);
        System.out.println("Pair 1: " + pair1); // In ra: Pair 1: (10, 20)

        // Tạo một đối tượng Pair với String
        Pair<String, String> pair2 = new Pair<>("Hello", "World");
        System.out.println("Pair 2: " + pair2); // In ra: Pair 2: (Hello, World)

        // Tạo một đối tượng Pair với String và Integer
        Pair<String, Integer> pair3 = new Pair<>("Age", 25);
        System.out.println("Pair 3: " + pair3); // In ra: Pair 3: (Age, 25)
    }
}
