public class Main {
    // TODO:down below
//    create object of the employee classes 1 is enough
//    then use it as inputs in the methods in the payrollSystem class
//    then apply different methods on them from the parROllSystem class to see the values of the objects
    public static void main(String[] args) {
        Employee partTimer = new partTimeEmployee(123, "Noor", 10, 15, 15);
        Employee fullTimer = new fullTimeEmployee(111, "kratos", 1200, 24);
        Employee fullTimer2 = new fullTimeEmployee(133, "Tino", 15 , 21);
        Employee fullTimer3 = new fullTimeEmployee(124, "John", 12, 23);
        Employee partTimer4 = new partTimeEmployee(125, "Jane", 15, 25, 12);
        Employee partTimer5 = new partTimeEmployee(126, "Doe", 18, 19, 19);

        payrollSystem payroll = new payrollSystem();

        payroll.addEmployee(partTimer);
        payroll.addEmployee(fullTimer);
        payroll.addEmployee(fullTimer3);
        payroll.addEmployee(fullTimer2);
        payroll.addEmployee(partTimer4);
        payroll.addEmployee(partTimer5);


        System.out.println("before");

        payroll.displayEmployees();

        payroll.removeEmployee(123);

        payroll.updatePartTimeEmployee(125, "kronos", 12, 12, 14);
        payroll.updateFullTimeEmployee(111, "ZEUS", 5000, 25);
        System.out.println("after removing noor employee");

        payroll.displayEmployees();

        payroll.searchEmployeeByID(126);
        payroll.searchEmployeeByID(111);

//  first i have to mark the attendance using the methods sepratly on both the employee objects
//  then call the report of the payroll system
      payroll.fullTimeEmployeeAttendanceReport(111);
      payroll.partTimeEmployeeAttendanceReport(125);

    }

}
