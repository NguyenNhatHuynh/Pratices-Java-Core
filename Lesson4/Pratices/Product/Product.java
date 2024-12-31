package Lesson4.Pratices.Product;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    // Constructor không tham số
    public Product() {
    }

    // Constructor có tham số
    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Setter
    public void setId(String id) {
        this.id = id;
    }

    // Getter
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    // Tính tổng giá trị của sản phẩm
    public double calculateTotalPrice() {
        return price * quantity;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println("----------------------------");
    }

}
