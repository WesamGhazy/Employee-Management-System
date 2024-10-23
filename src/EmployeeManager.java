import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private List<Employee> employeeList;

    public EmployeeManager() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (employee != null) { // Check if employee is not null
            employeeList.add(employee);
        } else {
            System.out.println("Cannot add null employee.");
        }
    }

    public void viewAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No Employees found.");
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }
    }

    public Employee findEmployeeByID(String employeeID) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID().equals(employeeID)) {
                return employee;
            }
        }
        return null;
    }

    public boolean updateEmployee(String employeeID, String name, int age, String position, double salary, String branchName, LocalDate startDate) {
        Employee employee = findEmployeeByID(employeeID);

        if (employee != null) {
            employee.setName(name);
            employee.setAge(age);
            employee.setPosition(position);
            employee.setSalary(salary);
            employee.setBranchName(branchName);
            employee.setStartDate(startDate);
            System.out.println("Employee details updated.");
            return true;
        } else {
            System.out.println("Employee not found.");
            return false;
        }
    }

    // Moved deleteEmployee method outside of updateEmployee method
    public boolean deleteEmployee(String employeeID) {
        Employee employee = findEmployeeByID(employeeID);
        if (employee != null) {
            employeeList.remove(employee);
            System.out.println("Employee removed.");
            return true;
        } else {
            System.out.println("Employee not found.");
            return false;
        }
    }
}
