import java.time.LocalDate;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nEmployee Managment System");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.println("Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option){

                case 1:

                    System.out.print("Enter Employee ID: ");
                    String employeeID = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Position: ");
                    String position = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Branch Name: ");
                    String branchName = scanner.nextLine();
                    System.out.print("Enter Start Date (YYYY-MM-DD): ");
                    LocalDate startDate = LocalDate.parse(scanner.nextLine());

                    Employee newEmployee = new Employee(employeeID, name, age, position, salary, branchName, startDate);
                    employeeManager.addEmployee(newEmployee);
                    break;

                case 2:
                    employeeManager.viewAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to update: ");
                    String updateID = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Position: ");
                    String newPosition = scanner.nextLine();
                    System.out.print("Enter New Salalry: ");
                    double newSalary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter New Branch Name: ");
                    String newBranchName = scanner.nextLine();
                    System.out.print("Enter New Start Date (YYYY-MM-DD): ");
                    LocalDate newStartDate = LocalDate.parse(scanner.nextLine());

                    employeeManager.updateEmployee(updateID, newName, newAge, newPosition, newSalary, newBranchName , newStartDate);
                    break;


                case 4:
                System.out.println("Enter Employee ID to delete: ");

                String deleteID = scanner.nextLine();
                employeeManager.deleteEmployee(deleteID);
                break;

                case 5:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please Try Again");
            }
        }
    }
}