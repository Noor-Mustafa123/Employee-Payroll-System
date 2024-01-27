public class partTimeEmployee extends Employee {
    int hoursWorked;
    int hourlyRate;

    //    Constructor
    public partTimeEmployee(int id, String name, int hoursWorked, int hourlyRate) {
        super(id, name);
    }

    @Override
    public double calculateSalary() {
        double Salary;
        Salary = this.hoursWorked * this.hourlyRate;
        return Salary;
    }
}
