package Lesson7.Lab;

abstract class SinhVien {

    private String name;
    private String major;

    public SinhVien(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public abstract double getDiem();

    public void display() {
        System.out.println("Tên: " + name);
        System.out.println("Ngành: " + major);
        System.out.println("Điểm: " + getDiem());
    }
}
