package Pratices.Polymorphism;

// Tính lương nhân viên
// Hãy xây dựng chương trình quản lý lương cho các loại nhân viên khác nhau:

// Nhân viên chính thức (Full-time) và Nhân viên thời vụ (Part-time).
// Mỗi loại nhân viên có cách tính lương riêng:
// Nhân viên Full-time: Lương cơ bản + Thưởng.
// Nhân viên Part-time: Số giờ làm việc × Đơn giá mỗi giờ.
// Yêu cầu:

// Tạo một lớp cha NhanVien với phương thức tinhLuong().
// Tạo các lớp con NhanVienFullTime và NhanVienPartTime, mỗi lớp override phương thức tinhLuong().
// Viết chương trình nhập thông tin cho từng loại nhân viên và hiển thị lương.

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
