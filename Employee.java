public abstract class Employee {

    protected String name;
    protected int id;

    //  constructor
    public Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }

//    Methods
    public abstract double calculateSalary();

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
    }
}

