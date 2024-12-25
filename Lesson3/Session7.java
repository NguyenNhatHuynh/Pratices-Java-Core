package Lesson3;

public class Session7 {
    public static void main(String[] args) {
        // An array storing different ages
        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

        int length = ages.length;

        int lowestAge = ages[0];

        for (int age : ages) {
            if (age < lowestAge) {
                lowestAge = age;
            }
        }
        // Output the value of the lowest age
        System.out.println("The lowest age in the array is: " + lowestAge);
    }
}
