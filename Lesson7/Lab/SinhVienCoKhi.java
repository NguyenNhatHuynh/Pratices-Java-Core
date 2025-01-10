package Lesson7.Lab;

public class SinhVienCoKhi extends SinhVien {
    private double scoreCNC;
    private double scorePLC;

    SinhVienCoKhi(String name, String major, double scoreCNC, double scorePLC) {
        super(name, major);
        this.scorePLC = scorePLC;
        this.scoreCNC = scoreCNC;
    }

    @Override
    public double getDiem() {
        return (this.scoreCNC + this.scorePLC) / 2;
    }
}
