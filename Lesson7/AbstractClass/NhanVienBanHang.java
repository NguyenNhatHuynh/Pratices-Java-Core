package Lesson7.AbstractClass;

public class NhanVienBanHang extends NhanVien {
    private double salary;
    private double salesBonus;

    public NhanVienBanHang(String id, String name, double salary, double salesBonus) {
        super(id, name);
        this.salary = salary;
        this.salesBonus = salesBonus;
    }

    @Override
    public double calculateSalary() {
        return salary + salesBonus;
    }
}
