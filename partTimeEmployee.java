public class partTimeEmployee extends Employee {
    protected int hoursWorked;
    protected int hourlyRate;


    //    Constructor
    public partTimeEmployee(int id, String name, int hoursWorked, int hourlyRate, int attendance) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        if (attendance <= 20) {
                this.attendance = attendance;
        } else {
            System.out.println("Too much Attendance");
        }
    }





    @Override
    public double calculateSalary() {
        double Salary;
        Salary = this.hoursWorked * this.hourlyRate;
        return Salary;
    }

    //    setter method
    public void setHourlyRate(int newRate) {
        this.hourlyRate = newRate;
    }

    public void setHoursWorked(int newHours) {
        this.hoursWorked = newHours;
    }

}
