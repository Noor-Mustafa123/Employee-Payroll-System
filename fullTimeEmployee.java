public class fullTimeEmployee extends Employee {
    protected int monthlySalary;

    //    constructor
    public fullTimeEmployee(int id, String name, int monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    //    methods
    @Override
    public double calculateSalary() {
        double Salary;
        Salary = monthlySalary;
        return Salary;
    }


    //    setter method
    public void setMonthlySalary(int newSalary) {
        this.monthlySalary = newSalary;
    }

}
