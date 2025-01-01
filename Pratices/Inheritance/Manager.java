package Pratices.Inheritance;

public class Manager extends Employee {
    private double allowance;

    public Manager(String name, double salary, double allowance) {
        super(name, salary);
        this.allowance = allowance;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + allowance;
    }

    @Override
    public String toString() {
        return "Manager{name='" + name + "', salary=" + getSalary() + ", allowance=" + allowance + "}";
    }
}
