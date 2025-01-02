package Pratices.Polymorphism;

import java.util.Scanner;

abstract class NhanVien {
    private String nameEmployee;

    public NhanVien(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public abstract double tinhLuong();

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void xuatThongTin() {
        System.out.printf(" Loai Nhan Vien: " + nameEmployee, " Tien Luong: " + tinhLuong());
    }
}
