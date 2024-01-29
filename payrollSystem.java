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

    public void updatePartTimeEmployee(int id, String newName, int newHourlyRate, int newHoursWorked) {
        for (Employee eachEmployee : employeeList) {
            if (eachEmployee.getId() == id && eachEmployee instanceof partTimeEmployee) {
//      down-casting to the specific subclass which has the setter method because
//      the method is expecting an object of the employee class to have the method instead which is not the case
                ((partTimeEmployee) eachEmployee).setHoursWorked(20);
                ((partTimeEmployee) eachEmployee).setHourlyRate(20);
                break;
            }
            else if (!(eachEmployee.getId() == id)) {
                System.out.println("An employee with this id number " + id + " does not exist in the list");
                break;
            }
            else if (!(eachEmployee instanceof partTimeEmployee)) {
                System.out.println("This employee is not a part time employee in this company");
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
