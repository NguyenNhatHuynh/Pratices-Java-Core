public class SinhVien {
    protected String id;
    protected String name;
    protected double price;
    protected double tax;

    public SinhVien(String id, String name, double price, double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public double getPriceTax() {
        return price * tax;
    }

    // Phương thức hiển thị thông tin
    public void info() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price Tax: " + getPriceTax());
    }
}
