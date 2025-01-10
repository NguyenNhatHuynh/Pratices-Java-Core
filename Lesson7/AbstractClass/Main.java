package Lesson7.AbstractClass;

import Pratices.Inheritance.Employee;

public class Main {
    public static void main(String[] args) {
        NhanVienBanHang nhanVienBanHang = new NhanVienBanHang("E01", "Alice", 3000, 10);
        NhanVienKyThuat nhanVienKyThuat = new NhanVienKyThuat("D2", "Nam", 30000);
        nhanVienBanHang.showInfo();
        System.out.println("Salary nhanVienBanHang: " + nhanVienBanHang.calculateSalary());

        nhanVienKyThuat.showInfo();
        System.out.println("Salary nhanVienKyThuat: " + nhanVienKyThuat.calculateSalary());

    }
}
