import java.util.ArrayList;

public class payrollSystem {
    // arraylist as instance variable
    ArrayList<Employee> employeeList;

    // constructor
    public payrollSystem() {
        // this creates a new empty arraylist
        employeeList = new ArrayList<>();
    }

    // ***METHODS***

    // Adding the values into the arraylist
    public void addEmployee(Employee employee) {

        if (!employeeList.contains(employee)) {
            employeeList.add(employee);
        } else {
            System.out.println("This employee already exists in the list.");
        }
    }

    // removing the values into the arraylist
    public void removeEmployee(int id) {
        for (Employee employeeObj : employeeList) {
            if (employeeObj.getId() == id) {
                employeeList.remove(employeeObj);
                System.out.println("Employee Removed!");
                break;
            } else {
                System.out.println("This employee does not exist in the list.");
                break;
            }

        }

    }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }
}
