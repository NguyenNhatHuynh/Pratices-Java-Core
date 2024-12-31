package Lesson4.Pratices.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ====================== Tạo đối tượng Product =====================

        // Tạo danh sách sản phẩm
        ArrayList<Product> productList = new ArrayList<>();

        // Thêm sản phẩm vào danh sách
        productList.add(new Product("P001", "Laptop", 1500.0, 10));
        productList.add(new Product("P002", "Smartphone", 800.0, 20));
        productList.add(new Product("P003", "Tablet", 600.0, 15));

        // Hiển thị thông tin và tính tổng giá trị từng sản phẩm
        for (Product product : productList) {
            product.displayInfo();
        }
    }
}
