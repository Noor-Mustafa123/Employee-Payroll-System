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

}

