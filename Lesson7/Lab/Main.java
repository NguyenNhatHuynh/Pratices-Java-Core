package Lesson7.Lab;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sinh Vien IT: ");
        SinhVienIT sinhVienIT = new SinhVienIT("Nhat Huynh", "Cong nghe thong tin", 10, 10);
        sinhVienIT.display();

        System.out.println("Sinh Vien Co khi: ");
        SinhVienCoKhi sinhVienCoKhi = new SinhVienCoKhi("Nhat Huynh", "Co Khi", 10, 10);
        sinhVienCoKhi.display();
    }
}
