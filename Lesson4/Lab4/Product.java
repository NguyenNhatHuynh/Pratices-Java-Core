package Lesson4.Lab4;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        name = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        price = scanner.nextDouble();

        System.out.print("Nhập thuế sản phẩm (phần trăm): ");
        tax = scanner.nextDouble();

    }

    public void xuatThongTin() {
        System.out.println("Thông tin sản phẩm:");
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá sản phẩm: " + price);
        System.out.println("Thuế sản phẩm: " + tax + "%");
        System.out.println("Số tiền thuế: " + getTaxPrice());
    }

    public double getTaxPrice() {
        return price * tax / 100;
    }

    public static void main(String[] args) {
        // Tạo đối tượng Product và nhập/xuất thông tin
        Product product1 = new Product("LapTop", 200.0, 10.0);
        Product product2 = new Product("Smartphone", 1500.0, 8.0);

        // In thông tin của 2 sản phẩm
        System.out.println("Thông tin sản phẩm 1:");
        product1.xuatThongTin();

        System.out.println("\nThông tin sản phẩm 2:");
        product2.xuatThongTin();
    }
}
