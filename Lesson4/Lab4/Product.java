package Lesson4.Lab4;

import java.util.Scanner;

public class Product {
    String name;
    double price;
    double tax;

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
        Product product = new Product();
        product.nhapThongTin();
        product.xuatThongTin();
    }
}
