package Lesson8;

public class Circle implements Shape {

    private double radius; // Bán kính của hình tròn
    private double pi = 3.14159;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return pi * radius * radius; // π * r^2
    } // Tính diện tích.

    // Tính chu vi hình tròn
    @Override
    public double calculatePerimeter() {
        return 2 * pi * radius; // 2 * π * r
    }
}
