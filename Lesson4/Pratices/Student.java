package Lesson4.Pratices;

public class Student {
    String name;
    int age;

    public void talk() {
        System.out.println("Good Student");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Xoan Dev";
        student.age = 22;
        student.talk();
        System.out.println("FullName: " + student.name + " Age: " + student.age);
    }
}
