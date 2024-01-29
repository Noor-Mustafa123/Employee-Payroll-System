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
//    public void removeEmployee(int id) {
//        Iterator<Employee> iterator = employeeList.iterator();
//        while(iterator.hasNext()) {
//           Employee employeeObj =  iterator.next();
//            if (employeeObj.getId() == id) {
//                iterator.remove();
//                System.out.println("Employee Removed!");
//                return;
//            }
//
//        }
//        System.out.println("This employee does not exist in the list.");
//
//    }

    public void removeEmployee(int id) {
        boolean empPresent = false;
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                employeeList.remove(emp);
                empPresent = true;
                break;
            }
        }
        if (!empPresent) {
            System.out.println("This employee does not exist in the list.");
        }
    }


    public void updatePartTimeEmployee(int id, String newName, int newHourlyRate, int newHoursWorked) {
        boolean employeeFound = false;
        boolean isPartTime = false;
        for (Employee eachEmployee : employeeList) {
            if (eachEmployee.getId() == id && eachEmployee instanceof partTimeEmployee) {
//      down-casting to the specific subclass which has the setter method because
//      the method is expecting an object of the employee class to have the method instead which is not the case
                ((partTimeEmployee) eachEmployee).setHoursWorked(newHoursWorked);
                ((partTimeEmployee) eachEmployee).setHourlyRate(newHourlyRate);
                eachEmployee.setName(newName);
                employeeFound = true;
                isPartTime = true;
                break;
            }
        }
        if (!employeeFound) {
            System.out.println("An employee with this id number " + id + " does not exist in the list");
        }
        if (!isPartTime) {
            System.out.println("This employee is not a part time employee in this company");
        }


    }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }
}
