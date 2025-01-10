package Lesson7.Lab;

public class SinhVienIT extends SinhVien {
    private double scoreJava;
    private double scoreHTML;

    SinhVienIT(String name, String major, double scoreJava, double scoreHTML) {
        super(name, major);
        this.scoreHTML = scoreHTML;
        this.scoreJava = scoreJava;
    }

    @Override
    public double getDiem() {
        return (scoreJava * 2 + scoreHTML) / 3;
    }
}
