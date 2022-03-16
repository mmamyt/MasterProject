package abstraction;

public class EmployeeContractor extends Employee{

    private int workHours;

    public EmployeeContractor(String name, double salary, int workHours) {
        super(name, salary);
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return getSalary() * workHours;
    }

    public static void main(String[] args) {
        EmployeeContractor John = new EmployeeContractor("John", 60, 40);
        System.out.println(John.calculateSalary());

        EmployeeContractor Bob = new EmployeeContractor("Bob", 75, 40);
        System.out.println(Bob.calculateSalary());

        EmployeeContractor Jessy = new EmployeeContractor("Jessy", 100, 40);
        System.out.println(Jessy.calculateSalary());
    }
}
