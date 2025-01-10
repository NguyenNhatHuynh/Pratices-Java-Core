package Lesson7.AbstractClass;

abstract class NhanVien {
    protected String id;
    protected String name;

    // Contructor
    public NhanVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    //  Abstract method: Mỗi loại nhân viên tính lương khác nhau
    public abstract double calculateSalary();
}
