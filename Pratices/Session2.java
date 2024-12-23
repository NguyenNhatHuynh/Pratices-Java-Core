package Pratices;
// byte => 1 byte

import java.util.Scanner;

// short => 2 bytes
// char => 2 bytes
// int => 4 bytes
// float => 4 bytes
// double => 8 bytes
// long => 8 bytes
// boolean => 1 byte (thường không phải 1 bit, tùy vào JVM)

public class Session2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pass: ");
        int pass = scanner.nextInt();
        int passCode = 12354;
        if (pass == passCode) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }
        scanner.close();
    }
}
