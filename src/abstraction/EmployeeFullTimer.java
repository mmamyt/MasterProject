package abstraction;

public class EmployeeFullTimer extends Employee{

    public EmployeeFullTimer(String name, double salary) {
        super(name, salary);

    }

    @Override
    public double calculateSalary() {
        return getSalary() * 40;
    }

    public static void main(String[] args) {
        EmployeeFullTimer et = new EmployeeFullTimer("Danny", 55);
        System.out.println(et.calculateSalary());

    }

}
