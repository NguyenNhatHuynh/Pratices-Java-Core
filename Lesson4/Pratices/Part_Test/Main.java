package Lesson4.Pratices.Part_Test;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.publicVar); // Accessible
        System.out.println(test.protectedVar);
        System.out.println(test.defaultVar);
        // System.out.println(test.privateVar); // Not accessible from here
    }
}
