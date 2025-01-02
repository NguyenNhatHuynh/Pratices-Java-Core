package Pratices.Polymorphism;

public class NhanVienFullTime extends NhanVien {
    private double luongCoBan;
    private double bonus;

    public NhanVienFullTime(String nameEmployee, double luongCoBan, double bonus) {
        super(nameEmployee);
        this.luongCoBan = luongCoBan;
        this.bonus = bonus;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + bonus;
    }
}
