package Lesson7.AbstractClass;

public class NhanVienKyThuat extends NhanVien {
    private double salary;

    public NhanVienKyThuat(String id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
