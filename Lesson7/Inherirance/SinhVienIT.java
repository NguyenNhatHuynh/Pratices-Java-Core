
public class SinhVienIT extends SinhVien {
    private String language;

    public SinhVienIT(String id, String name, double price, double tax) {
        super(id, name, price, tax);
        this.language = "Not set";
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    // Ghi đè phương thức info
    @Override
    public void info() {
        System.out
                .println("ID: " + id + ", Name: " + name + ", Price Tax: " + getPriceTax() + ", Language: " + language);
    }
}
