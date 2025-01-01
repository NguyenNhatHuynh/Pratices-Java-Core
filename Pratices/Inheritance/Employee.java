
package Pratices.Inheritance;

// Bài tập 1: Tính lương nhân viên
// Đề bài:
// Xây dựng một chương trình tính lương cho nhân viên. Có hai loại nhân viên:

// Nhân viên thường: Có lương cơ bản.
// Nhân viên quản lý: Có lương cơ bản và thêm phụ cấp.
// Yêu cầu:

// Tạo lớp cha Employee với các thuộc tính: name và salary.
// Tạo lớp con Manager kế thừa Employee với thuộc tính phụ cấp (allowance).
// Viết phương thức để tính lương (getSalary) cho cả hai loại nhân viên.

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name = '" + name + "', salary=" + getSalary() + "}";
    }

}
