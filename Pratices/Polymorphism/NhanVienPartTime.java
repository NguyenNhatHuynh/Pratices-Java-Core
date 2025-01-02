package Pratices.Polymorphism;

public class NhanVienPartTime extends NhanVien {
    private double numWorkHour;
    private double hourlyRate;

    public NhanVienPartTime(String nameEmployee, double numWorkHour, double hourlyRate) {
        super(nameEmployee);
        this.numWorkHour = numWorkHour;
        this.hourlyRate = hourlyRate;
    }

    public void setNumWorkHour(double numWorkHour) {
        this.numWorkHour = numWorkHour;
    }

    public double getNumWorkHour() {
        return numWorkHour;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double tinhLuong() {
        return numWorkHour * hourlyRate;
    }

}
