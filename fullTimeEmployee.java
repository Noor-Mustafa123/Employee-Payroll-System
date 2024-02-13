public class fullTimeEmployee extends Employee {
    protected int monthlySalary;

    //    constructor
    public fullTimeEmployee (int id, String name, int monthlySalary, int attendance) {
        super(id, name);
        this.monthlySalary = monthlySalary;
        if (attendance <= 24) {
            this.attendance = attendance;
        } else {
            System.out.println("Too much Attendance");
        }
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
