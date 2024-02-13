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


    public void displayEmployees() {
        for (Employee employee : employeeList) {
            if (employee instanceof partTimeEmployee) {
                employee.employeeStatus = "Part Time Employee";
                System.out.println(employee.toString());
            } else if (employee instanceof fullTimeEmployee) {
                employee.employeeStatus = "Full Time Employee";
                System.out.println(employee.toString());
            }
        }

    }


    public void updatePartTimeEmployee(int id, String newName, int newHourlyRate, int newHoursWorked, int newAttendance) {
        boolean employeeFound = false;
        boolean isPartTime = false;
        for (Employee eachEmployee : employeeList) {
            if (eachEmployee.getId() == id && eachEmployee instanceof partTimeEmployee) {
//      down-casting to the specific subclass which has the setter method because
//      the method is expecting an object of the employee class to have the method instead which is not the case
                ((partTimeEmployee) eachEmployee).setHoursWorked(newHoursWorked);
                ((partTimeEmployee) eachEmployee).setHourlyRate(newHourlyRate);
                eachEmployee.setName(newName);
                eachEmployee.setAttendance(newAttendance);
                employeeFound = true;
                isPartTime = true;
                break;
            }
        }
        if (!employeeFound) {
            System.out.println("An employee with this id number " + id + " does not exist in the list");
        }
        if (!isPartTime) {
            System.out.println("This employee is not a PART time employee in this company");
        }


    }


    public void updateFullTimeEmployee(int id, String newName, int newMonthlySalary, int newAttendance) {
        boolean employeeFound = false;
        boolean isFullTime = false;
        for (Employee eachEmployee : employeeList) {
            if (eachEmployee.getId() == id && eachEmployee instanceof fullTimeEmployee) {
                ((fullTimeEmployee) eachEmployee).setMonthlySalary(newMonthlySalary);
                eachEmployee.setName(newName);
                eachEmployee.setAttendance(newAttendance);
                employeeFound = true;
                isFullTime = true;
                break;
            }
        }
        if (!employeeFound) {
            System.out.println("An employee with this id number " + id + " does not exist in the list");
        }
        if (!isFullTime) {
            System.out.println("This employee is not a FULL time employee in this company");
        }


    }

    //     A method to search for employees thorough the list
    public void searchEmployeeByID(int id) {
        boolean employeeExistance = false;
//        a for each loop which goes through the list of employee and returns the matching id employee object
        for (Employee item : employeeList) {
            if (item.getId() == id) {
                item.displayEmployeeData(item);
                employeeExistance = true;
                break;
            }
        }
        if (!employeeExistance) {
            System.out.println("An Employee with the ID#" + id + "does not exist in the system");
        }
    }

    //    add a method to mark the attendance of an employee?
//    check if an employee matches the id then apply the markAttendance filter on it
    public void fullTimeEmployeeAttendanceReport(int id) {
        boolean employeeFound = false;
        boolean isFullTime = false;
        for (Employee eachEmployee : employeeList) {
            if (eachEmployee.getId() == id && eachEmployee instanceof fullTimeEmployee) {
                int Attendance = eachEmployee.getAttendance();
                System.out.println("This full time employee has been present on the job for " + Attendance + " out of 24 working days");
                employeeFound = true;
                isFullTime = true;
                break;
            }
        }
        if (!employeeFound) {
            System.out.println("An Employee with the ID#" + id + "does not exist in the system");
        }
        if (!isFullTime) {
            System.out.println("This employee is not a full time employee");
        }

    }

    public void partTimeEmployeeAttendanceReport(int id) {
        boolean employeeFound = false;
        boolean isPartTime = false;
        for (Employee eachEmployee : employeeList) {
            if (eachEmployee.getId() == id && eachEmployee instanceof partTimeEmployee) {
                int Attendance = eachEmployee.getAttendance();
                System.out.println("This part time employee has been present on the job for " + Attendance + " out of 20 working days");
                employeeFound = true;
                isPartTime = true;
                break;
            }
        }
        if (!employeeFound) {
            System.out.println("An Employee with the ID#" + id + "does not exist in the system");
        }
        if (!isPartTime) {
            System.out.println("This employee is not a full time employee");
        }

    }

}
