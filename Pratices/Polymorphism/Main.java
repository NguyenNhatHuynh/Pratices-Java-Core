package Pratices.Polymorphism;

public class Main {
    public static void main(String[] args) {
        NhanVien[] danhSach = {
                new NhanVienFullTime("An ", 50000, 1000),
                new NhanVienPartTime("Nam", 50, 20),
                new NhanVienFullTime("Tam", 50000, 1000),
        };

        for (NhanVien nv : danhSach) {
            nv.xuatThongTin();
        }
    }
}
