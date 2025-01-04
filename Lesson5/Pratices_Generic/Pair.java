package Lesson5.Pratices_Generic;

public class Pair<F, S> {
    private F first;
    private S second;

    // Phương thức khởi tạo
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    // Phương thức lấy giá trị first
    public F getFirst() {
        return first;
    }

    // Phương thức lấy giá trị first
    public S getSecond() {
        return second;
    }

    // Phương thức toString để in ra cặp giá trị
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

}
