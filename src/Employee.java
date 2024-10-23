import java.time.LocalDate;

public class Employee {

    private String employeeID;
    private String name;
    private int age ;
    private String position ;
    private double salary;
    private String branchName;
    private LocalDate startDate;

    public Employee(String employeeID, String name, int age, String position, double salary, String branchName, LocalDate startDate) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.branchName = branchName;
        this.startDate = startDate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getBranchName() {
        return branchName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeID + ", Name: " + name + ", Age: " + age +
                ", Position: " + position + ", Salary: $" + salary +
                ", Branch: " + branchName + ", Start Date: " + startDate;
    }

}
