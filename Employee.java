public abstract class Employee {
    //INSTANCE VARIABLES
    protected String name;
    protected int id;

    protected String  employeeStatus;

    protected int attendance = 0;

    //  constructor
    public Employee(int id, String name) {
        this.name = name;
        this.id = id;}



    //    Methods
    public abstract double calculateSalary();

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + ", Total Attendance = " +attendance+ ", Employee Status =  " + employeeStatus + "]";
    }

    public void displayEmployeeData(Employee emp) {
        System.out.println("Employee DATA");
        String output = emp.toString();
        System.out.println(output);
    }

    //    method to mark attendance
    public void markAttendance(boolean present) {
        if (present) {
            this.attendance += 1;
        }
    }

    //    method to return the attendance value
    public int getAttendance() {
        return this.attendance;
    }

    //    set attendance method
    public void setAttendance(int newAttendance) {
        this.attendance = newAttendance;
    }
}



