public class Main {
    // TODO:down below
//    create object of the employee classes 1 is enough
//    then use it as inputs in the methods in the payrollSystem class
//    then apply different methods on them from the parROllSystem class to see the values of the objects
    public static void main(String[] args) {
        Employee partTimer = new partTimeEmployee(123, "Noor", 10, 15);
        Employee fullTimer = new fullTimeEmployee(111, "koros", 1200);
        Employee partTimer2 = new partTimeEmployee(133, "Tino", 15, 15);

        payrollSystem payroll = new payrollSystem();

        payroll.addEmployee(partTimer);
        payroll.addEmployee(fullTimer);
        payroll.addEmployee(partTimer2);

        payroll.displayEmployees();

        payroll.removeEmployee(123);


    }

}
