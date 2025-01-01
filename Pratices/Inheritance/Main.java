package Pratices.Inheritance;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Xoan Dev", 10000000);
        Manager mgr1 = new Manager("Nhat Huynh", 1000000, 100000);

        System.out.println(emp1);
        System.out.println(mgr1);
    }
}
