public class Main {
    public static void main(String[] args) {
        SinhVienIT sinhVienIT1 = new SinhVienIT("1", "Student Name 1", 2000.00, 23.000);
        SinhVienIT sinhVienIT2 = new SinhVienIT("2", "Student Name 2", 450.00, 23.000);
        SinhVienIT sinhVienIT3 = new SinhVienIT("3", "Student Name 3", 2500.00, 23.000);

        sinhVienIT1.setLanguage("English");
        sinhVienIT1.info();
    }
}
