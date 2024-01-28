public class fullTimeEmployee extends Employee {
    int monthlySalary;

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
    public int getId(){
      return  this.id;
    }
}
